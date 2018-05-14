package com.dao;

import com.entiy.employeeinfo;

public interface employeeinfoMapper {
    int deleteByPrimaryKey(Integer eId);

    int insert(employeeinfo record);

    int insertSelective(employeeinfo record);

    employeeinfo selectByPrimaryKey(Integer eId);

    int updateByPrimaryKeySelective(employeeinfo record);

    int updateByPrimaryKey(employeeinfo record);
    /**
     * 用户登录验证
     */
    employeeinfo login(employeeinfo record);
}