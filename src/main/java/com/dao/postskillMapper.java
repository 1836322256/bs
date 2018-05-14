package com.dao;

import com.entiy.postskill;

public interface postskillMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(postskill record);

    int insertSelective(postskill record);

    postskill selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(postskill record);

    int updateByPrimaryKey(postskill record);
}