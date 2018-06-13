package com.hotpot.mapper;

import com.hotpot.entity.UserCollect;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserCollectMapper {
    int deleteByPrimaryKey(@Param("userId") Integer userId, @Param("offerId") Integer offerId);

    int insert(UserCollect record);

    int insertSelective(UserCollect record);

    UserCollect selectByPrimaryKey(@Param("userId") Integer userId, @Param("offerId") Integer offerId);

    List<UserCollect> selectByUserId(@Param("userId") Integer userId , @Param("limit") Integer limit);

    int updateByPrimaryKeySelective(UserCollect record);

    int updateByPrimaryKey(UserCollect record);
}