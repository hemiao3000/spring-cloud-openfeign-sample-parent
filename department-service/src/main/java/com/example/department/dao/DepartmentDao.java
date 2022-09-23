package com.example.department.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.department.bean.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentDao extends BaseMapper<Department> {

}