package com.example.employee.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("employee")
public class Employee {

    /**
     * 员工ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 员工岗位名称
     */
    private String job;

    /**
     * 员工上级领导编号
     */
    private Long managerId;

    /**
     * 入职日期
     */
    private LocalDate hireDate;

    /**
     * 工资
     */
    private Integer salary;

    /**
     * 佣金/奖金
     */
    private Integer commission;

    /**
     * 所属部门编号
     */
    private Long departmentId;

    @TableField(exist = false)
    private Department department;
}
