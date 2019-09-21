package com.example.amal.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SecEmployeeService implements IEmployeeService{

    List<String> emps = new ArrayList<>(Arrays.asList("Mr. Nazeel", "Mr. Amal"));

    @Override
    public List<String> getEmployees() {
        return emps;
    }

    @Override
    public List<String> addEmployee(String name){
        System.out.println("addEmployees " + name  );
        emps.add("Mr. " + name);
        return emps;
    }
}
