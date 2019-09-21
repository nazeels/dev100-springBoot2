package com.example.amal.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<String> emps = new ArrayList<>(Arrays.asList("Nazeel", "Amal"));

    public List<String> getEmployees() {
        return emps;
    }

    public List<String> addEmployee(String name){
        System.out.println("addEmployees " + name  );
        emps.add(name);
        return emps;
    }
}
