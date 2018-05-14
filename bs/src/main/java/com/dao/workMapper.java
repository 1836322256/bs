package com.dao;

import com.entiy.work;

public interface workMapper {
    int deleteByPrimaryKey(Integer wId);

    int insert(work record);

    int insertSelective(work record);

    work selectByPrimaryKey(Integer wId);

    int updateByPrimaryKeySelective(work record);

    int updateByPrimaryKey(work record);
}