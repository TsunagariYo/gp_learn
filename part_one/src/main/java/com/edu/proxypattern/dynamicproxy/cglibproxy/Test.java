package com.edu.proxypattern.dynamicproxy.cglibproxy;

import jdk.nashorn.internal.runtime.logging.DebugLogger;
import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @ClassName Test
 * @Description
 * @Author Administrator
 * @Date 2020/6/17 0017 15:51
 */
public class Test {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"E://cglib_class");
        Customer instance = (Customer)new CGMeipo().getInstance(Customer.class);
        instance.findlove();
    }
}
