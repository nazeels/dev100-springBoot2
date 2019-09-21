package com.example.amal.service;

import java.util.List;

public interface IEmployeeService {
    List<String> getEmployees();

    List<String> addEmployee(String name);
}
