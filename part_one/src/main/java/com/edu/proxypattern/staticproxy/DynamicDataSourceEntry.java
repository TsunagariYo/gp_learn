package com.edu.proxypattern.staticproxy;

/**
 * @ClassName DynamicDataSourceEntry
 * @Description
 * @Author Administrator
 * @Date 2020/6/17 0017 9:28
 */

import java.util.Locale;

/**
 * 动态切换数据源
 */
public class DynamicDataSourceEntry {
    //默认数据源
    public final static String DEFAULT_SOURCE = null;

    private final static ThreadLocal<String> LOCAL = new ThreadLocal<String>();

    private DynamicDataSourceEntry() {
    }

    /**
     * 清空数据源
     */
    public static void clear() {
        LOCAL.remove();
    }

    public static String get() {
        return LOCAL.get();
    }

    public static void restore() {
        LOCAL.set(DEFAULT_SOURCE);
    }

    public static void set(String source) {
        LOCAL.set(source);
    }
    /**
     *	根据年份动态设置数据源
     *	@param year
     */
    public static void set(int year) {
        LOCAL.set("DB_" + year);
    }


}
