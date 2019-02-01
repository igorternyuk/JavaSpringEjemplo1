package com.igorternyuk.app.services;

import com.igorternyuk.app.models.Employee;

import java.util.List;

/**
 * Created by zenko on 01.02.19.
 */
public interface EmployeeService {
    List<Employee> getEmployees();
}
