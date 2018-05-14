package com.dao;

import com.entiy.caucus;

public interface caucusMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(caucus record);

    int insertSelective(caucus record);

    caucus selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(caucus record);

    int updateByPrimaryKey(caucus record);
}