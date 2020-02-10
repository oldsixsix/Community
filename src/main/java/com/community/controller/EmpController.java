package com.community.controller;

import com.community.domain.Employee;
import com.community.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    @Autowired
    EmployeeMapper employeeMapper;
    @GetMapping("/Emp/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id){
        Employee empById = employeeMapper.getEmpById(id);
        System.out.println(empById);
        return empById;
    }

}
