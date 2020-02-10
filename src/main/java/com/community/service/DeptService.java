package com.community.service;

import com.community.domain.Department;
import org.springframework.stereotype.Service;


public interface DeptService {
    public Department getDepartmentById(Integer id);
}
