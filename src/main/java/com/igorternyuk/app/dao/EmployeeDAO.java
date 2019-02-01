package com.igorternyuk.app.dao;

import com.igorternyuk.app.models.Employee;

import java.util.List;

/**
 * Created by zenko on 01.02.19.
 */
public interface EmployeeDAO {
    List<Employee> getEmployees();
}
