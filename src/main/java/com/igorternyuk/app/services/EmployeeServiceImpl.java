package com.igorternyuk.app.services;

import com.igorternyuk.app.dao.EmployeeDAO;
import com.igorternyuk.app.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zenko on 01.02.19.
 */

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeDAO dao;

    @Override
    public List<Employee> getEmployees(){
        return dao.getEmployees();
    }
}
