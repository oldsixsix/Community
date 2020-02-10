package com.community.service;

import com.community.domain.Department;
import com.community.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class DeptServiceImp implements DeptService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public Department getDepartmentById(Integer id) {
        return departmentMapper.getDeptById(id);
    }
}
