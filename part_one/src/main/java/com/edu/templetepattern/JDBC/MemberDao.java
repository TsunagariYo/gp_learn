package com.edu.templetepattern.JDBC;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @ClassName MemberDao
 * @Description
 * @Author Administrator
 * @Date 2020/7/8 0008 11:10
 */
public class MemberDao extends JDBCTemplete {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }
    public List<?> selectAll() throws Exception {
        String sql =   "select * from t_member";
        return super.executeQuery(sql, new RowMapper<Object>() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setPassword(rs.getString("password"));
                member.setNickName("nickName");
                member.setUsername("username");
                return member;
            }
        },null);
    }

}
