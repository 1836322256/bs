package com.dao;

import com.entiy.train;

public interface trainMapper {
    int deleteByPrimaryKey(Integer tId);

    int insert(train record);

    int insertSelective(train record);

    train selectByPrimaryKey(Integer tId);

    int updateByPrimaryKeySelective(train record);

    int updateByPrimaryKey(train record);
}