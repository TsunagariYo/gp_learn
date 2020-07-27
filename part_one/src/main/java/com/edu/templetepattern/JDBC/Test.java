package com.edu.templetepattern.JDBC;

import java.util.List;

/**
 * @ClassName Test
 * @Description
 * @Author Administrator
 * @Date 2020/7/8 0008 11:42
 */
public class Test {
    public static void main(String[] args) throws Exception {
        MemberDao dao = new MemberDao(null);
        List<?> list = dao.selectAll();
        System.out.println(list);
    }
}
