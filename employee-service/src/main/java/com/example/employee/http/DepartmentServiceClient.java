package com.example.employee.http;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("department-service")
public interface DepartmentServiceClient {

    @GetMapping("/department")
    public String getDepartment(@RequestParam("id") Long id) ;

}
