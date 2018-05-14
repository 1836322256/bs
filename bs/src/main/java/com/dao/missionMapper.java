package com.dao;

import com.entiy.mission;

public interface missionMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(mission record);

    int insertSelective(mission record);

    mission selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(mission record);

    int updateByPrimaryKey(mission record);
}