package com.example.employee.service;

import com.example.employee.bean.Department;
import com.example.employee.bean.Employee;
import com.example.employee.dao.EmployeeDao;
import com.example.employee.http.DepartmentServiceClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class EmployeeService {

    @Resource
    private EmployeeDao employeeDao;

    @Resource
    private DepartmentServiceClient departmentServiceClient;

    @Resource
    private ObjectMapper defaultObjectMapper;

    @SneakyThrows
    public Employee getEmployeeById(Long id) {
        Employee employee = employeeDao.selectById(id);

        String jsonStr = departmentServiceClient.getDepartment(employee.getDepartmentId());
        Department department = defaultObjectMapper.readValue(jsonStr, Department.class);
        employee.setDepartment(department);

        return employee;
    }
}
