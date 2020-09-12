package com.edu.templetepattern.JDBC;

import java.sql.ResultSet;

/**
 * orm做映射的定制化的接口
 * @param <T>
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
