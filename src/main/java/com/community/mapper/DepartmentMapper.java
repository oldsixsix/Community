package com.community.mapper;


import com.community.domain.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

//指定这个是一个操作数据库的mapper
@Repository
@Mapper
public interface DepartmentMapper {
//    注解版的配置
    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int DeleteDeptById(Integer id);

//使用自增主键，并且主键列名为id
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentNmae) values(#{departmentNmae})")
    public int insertDeptById(Department department);

    @Update("update department")
    public int updateDeptById(Integer id);
}
