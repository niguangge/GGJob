package com.hotpot.dao;

import com.hotpot.entity.CommentTrustList;
import org.apache.ibatis.annotations.Param;

public interface CommentTrustListMapper {
    int deleteByPrimaryKey(@Param("commentId") Integer commentId, @Param("userId") String userId);

    int insert(CommentTrustList record);

    int insertSelective(CommentTrustList record);

    CommentTrustList selectByPrimaryKey(@Param("commentId") Integer commentId, @Param("userId") String userId);

    int updateByPrimaryKeySelective(CommentTrustList record);

    int updateByPrimaryKey(CommentTrustList record);
}