package com.hotpot.dao;

import com.hotpot.entity.OfferComments;
import org.apache.ibatis.annotations.Param;

public interface OfferCommentsMapper {
    int deleteByPrimaryKey(@Param("offerId") Integer offerId, @Param("commentId") Integer commentId);

    int insert(OfferComments record);

    int insertSelective(OfferComments record);

    OfferComments selectByPrimaryKey(@Param("offerId") Integer offerId, @Param("commentId") Integer commentId);

    int updateByPrimaryKeySelective(OfferComments record);

    int updateByPrimaryKey(OfferComments record);
}