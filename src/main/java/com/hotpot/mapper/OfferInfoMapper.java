package com.hotpot.mapper;

import com.hotpot.entity.OfferInfo;

public interface OfferInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OfferInfo record);

    int insertSelective(OfferInfo record);

    OfferInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OfferInfo record);

    int updateByPrimaryKey(OfferInfo record);
}