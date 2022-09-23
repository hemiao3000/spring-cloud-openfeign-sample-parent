package com.example.department.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("`department`")
public class Department {
    /**
     * 部门ID
     */
    @TableId(value = "`id`", type = IdType.NONE)
    private Long id;

    /**
     * 部门名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 部门所在地
     */
    @TableField(value = "`location`")
    private String location;
}
