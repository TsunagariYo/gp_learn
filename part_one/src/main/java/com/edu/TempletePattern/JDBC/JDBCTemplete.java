package com.edu.TempletePattern.JDBC;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName JDBCTemplete
 * @Description
 * @Author Administrator
 * @Date 2020/7/8 0008 10:45
 */
public abstract class JDBCTemplete {
    private DataSource dataSource;

    public JDBCTemplete(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) throws Exception {
        //获取连接
        Connection connection = this.getConnection();
        //创建语句集
        PreparedStatement preparedStatement = this.createPrepareStatement(connection, sql);
        //执行语句集
        ResultSet resultSet = this.executeQuery(preparedStatement, values);
        //处理结果集
        List<?> list = this.parseResultSet(resultSet, rowMapper);
        //关闭结果集
        this.closeResultSet(resultSet);
        //关闭语句集
        this.closeStatement(preparedStatement);
        //关闭连接
        this.closeConnection(connection);
        return list;
    }

    protected void closeStatement(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
    }

    ;

    protected void closeResultSet(ResultSet resultSet) throws SQLException {
        resultSet.close();
    }

    ;

    protected void closeConnection(Connection connection) throws SQLException {
        //可以写成数据库连接池回收
        connection.close();
    }

    ;

    protected List<?> parseResultSet(ResultSet resultSet, RowMapper<?> rowMapper) throws Exception {
        List<Object> list = new ArrayList<Object>();
        int rowNum = 1;
        while (resultSet.next()) {
            list.add(rowMapper.mapRow(resultSet, rowNum++));
        }
        return list;
    }

    ;

    private ResultSet executeQuery(PreparedStatement preparedStatement, Object[] values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            preparedStatement.setObject(i, values[i]);
        }
        return preparedStatement.executeQuery();
    }

    protected PreparedStatement createPrepareStatement(Connection connection, String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }

    ;


    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

}
