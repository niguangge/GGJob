package com.hotpot.mapper;

import com.hotpot.entity.CommentInfo;

public interface CommentInfoMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(CommentInfo record);

    int insertSelective(CommentInfo record);

    CommentInfo selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(CommentInfo record);

    int updateByPrimaryKey(CommentInfo record);
}