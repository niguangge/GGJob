package com.hotpot.dao;

import com.hotpot.entity.OfferTrustList;
import org.apache.ibatis.annotations.Param;

public interface OfferTrustListMapper {
    int deleteByPrimaryKey(@Param("offerId") Integer offerId, @Param("userId") String userId);

    int insert(OfferTrustList record);

    int insertSelective(OfferTrustList record);

    OfferTrustList selectByPrimaryKey(@Param("offerId") Integer offerId, @Param("userId") String userId);

    int updateByPrimaryKeySelective(OfferTrustList record);

    int updateByPrimaryKey(OfferTrustList record);
}