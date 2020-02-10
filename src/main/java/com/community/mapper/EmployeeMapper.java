package com.community.mapper;

import com.community.domain.Employee;
import org.apache.ibatis.annotations.Mapper;

//将接口装配到容器中
@Mapper
public interface EmployeeMapper {

     Employee getEmpById(Integer id);
}
