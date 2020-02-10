package com.community.controller;

import com.community.domain.Department;
import com.community.mapper.DepartmentMapper;
import com.community.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
//    在mapper中添加@Repository则不会报错
    @Autowired
    private DeptService deptService;
    @Autowired
    private DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartmentById(@PathVariable("id") Integer id){
//        /dept/{id}使用这种方式的时候要用占位符注解标记参数
        Department departmentById = deptService.getDepartmentById(id);
        System.out.println(departmentById);
//       可以直接把返回信息发到空白页上显示
        return departmentById;
    }

    @GetMapping("/dept")
    public Department insert(Department department){
//        /dept/{id}使用这种方式的时候要用占位符注解标记参数
        int i = departmentMapper.insertDeptById(department);
        System.out.println(i);
        return department;
    }
}
