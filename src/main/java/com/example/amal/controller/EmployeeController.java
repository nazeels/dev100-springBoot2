package com.example.amal.controller;


import com.example.amal.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping("/get")
    public List<String> getEmloyees(){
        return employeeService.getEmployees();
    }

    @PostMapping("/add/{name}")
    public List<String> addEmployees(@PathVariable(name="name") String name){
        return employeeService.addEmployee(name);
    }
}
