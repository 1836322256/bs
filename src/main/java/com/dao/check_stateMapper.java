package com.dao;

import com.entiy.check_state;

public interface check_stateMapper {
    int deleteByPrimaryKey(Long cId);

    int insert(check_state record);

    int insertSelective(check_state record);

    check_state selectByPrimaryKey(Long cId);

    int updateByPrimaryKeySelective(check_state record);

    int updateByPrimaryKey(check_state record);
}