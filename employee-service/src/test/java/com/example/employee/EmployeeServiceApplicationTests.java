package com.example.employee;

import com.example.employee.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class EmployeeServiceApplicationTests {

    @Resource
    private EmployeeService employeeService;

    @Test
    void contextLoads() {
        System.out.println(employeeService.getEmployeeById(1L));
    }

}
