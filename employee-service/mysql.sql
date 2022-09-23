DROP DATABASE IF EXISTS emp_db;
CREATE DATABASE emp_db
    DEFAULT CHARACTER SET utf8mb4 -- 乱码问题
    DEFAULT COLLATE utf8mb4_bin -- 英文大小写不敏感问题
;
USE emp_db;

DROP TABLE IF EXISTS employee;
CREATE TABLE employee
(
    `id`            BIGINT NOT NULL COMMENT '员工ID',
    `name`          VARCHAR(16) COMMENT '员工姓名',
    `job`           VARCHAR(16) COMMENT '员工岗位名称',
    `manager_id`    BIGINT COMMENT '员工上级领导编号',
    `hire_date`     DATE COMMENT '入职日期',
    `salary`        INT COMMENT '工资',
    `commission`    INT COMMENT '佣金/奖金',
    `department_id` BIGINT COMMENT '所属部门编号',
    PRIMARY KEY (`id`)
) COMMENT '雇员信息表';

INSERT INTO employee
VALUES (1, 'SMITH', 'CLERK', 13, '1980-12-17', 800, NULL, 2),
       (2, 'ALLEN', 'SALESMAN', 6, '1981-02-20', 1600, 300, 3),
       (3, 'WARD', 'SALESMAN', 6, '1981-02-22', 1250, 500, 3),
       (4, 'JONES', 'MANAGER', 9, '1981-04-02', 2975, NULL, 2),
       (5, 'MARTIN', 'SALESMAN', 6, '1981-09-28', 1250, 1400, 3),
       (6, 'BLAKE', 'MANAGER', 9, '1981-05-01', 2850, NULL, 3),
       (7, 'CLARK', 'MANAGER', 9, '1981-06-09', 2450, NULL, 1),
       (8, 'SCOTT', 'ANALYST', 4, '1987-07-13', 3000, NULL, 2),
       (9, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000, NULL, 1),
       (10, 'TURNER', 'SALESMAN', 6, '1981-09-08', 1500, NULL, 3),
       (11, 'ADAMS', 'CLERK', 8, '1987-07-13', 1100, NULL, 2),
       (12, 'JAMES', 'CLERK', 6, '1981-12-03', 950, NULL, 3),
       (13, 'FORD', 'ANALYST', 4, '1981-12-03', 3000, NULL, 2),
       (14, 'MILLER', 'CLERK', 7, '1982-01-23', 1300, NULL, 1);
