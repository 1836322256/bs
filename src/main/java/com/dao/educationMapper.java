package com.dao;

import com.entiy.education;

public interface educationMapper {
    int deleteByPrimaryKey(Integer edId);

    int insert(education record);

    int insertSelective(education record);

    education selectByPrimaryKey(Integer edId);

    int updateByPrimaryKeySelective(education record);

    int updateByPrimaryKey(education record);
}