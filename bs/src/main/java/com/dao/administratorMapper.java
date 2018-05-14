package com.dao;

import com.entiy.administrator;

public interface administratorMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(administrator record);

    int insertSelective(administrator record);

    administrator selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(administrator record);

    int updateByPrimaryKey(administrator record);
}