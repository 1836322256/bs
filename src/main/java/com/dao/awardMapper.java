package com.dao;

import com.entiy.award;

public interface awardMapper {
    int deleteByPrimaryKey(Integer awId);

    int insert(award record);

    int insertSelective(award record);

    award selectByPrimaryKey(Integer awId);

    int updateByPrimaryKeySelective(award record);

    int updateByPrimaryKey(award record);
}