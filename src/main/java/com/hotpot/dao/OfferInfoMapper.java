package com.hotpot.dao;

import com.hotpot.entity.OfferInfo;

public interface OfferInfoMapper {
    int deleteByPrimaryKey(Integer offerId);

    int insert(OfferInfo record);

    int insertSelective(OfferInfo record);

    OfferInfo selectByPrimaryKey(Integer offerId);

    int updateByPrimaryKeySelective(OfferInfo record);

    int updateByPrimaryKey(OfferInfo record);
}