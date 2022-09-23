package com.example.department.service;

import com.example.department.bean.Department;
import com.example.department.dao.DepartmentDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentDao departmentDao;

    public Department getDepartmentById(Long id) {
        return departmentDao.selectById(id);
    }

}
