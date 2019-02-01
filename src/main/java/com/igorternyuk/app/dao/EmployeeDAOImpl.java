package com.igorternyuk.app.dao;

import com.igorternyuk.app.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by zenko on 01.02.19.
 */

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Employee> getEmployees(){
        return jdbcTemplate.query("SELECT * FROM Employee"
                , new RowMapper<Employee>() {
                    @Override
                    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                        Employee employee = new Employee(
                                resultSet.getInt("id"),
                                resultSet.getString("name"),
                                resultSet.getInt("age"),
                                resultSet.getInt("salary")
                        );
                        return employee;
                    }
                });
    }
}
