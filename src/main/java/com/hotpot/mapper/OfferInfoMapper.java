package com.hotpot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hotpot.entity.OfferInfo;

public interface OfferInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OfferInfo record);

    int insertSelective(OfferInfo record);

    OfferInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OfferInfo record);

    int updateByPrimaryKey(OfferInfo record);
    
    List<OfferInfo> selectOfferOrderByDate(@Param("limit") int limit,@Param("offset") int offset);
    
    List<OfferInfo> selectOfferOrderByHeat(@Param("limit") int limit,@Param("offset") int offset);
    
    int getCount();
}