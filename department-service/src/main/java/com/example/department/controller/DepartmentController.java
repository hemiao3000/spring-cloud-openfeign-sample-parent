package com.example.department.controller;

import com.example.department.bean.Department;
import com.example.department.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping("/department")
    public Department getDepartment(@RequestParam("id") Long id) {
        return departmentService.getDepartmentById(id);
    }

}
