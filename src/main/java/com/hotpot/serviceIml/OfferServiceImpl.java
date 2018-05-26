package com.hotpot.serviceIml;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotpot.dao.OfferInfoMapper;
import com.hotpot.entity.OfferInfo;
import com.hotpot.service.OfferService;

@Service
public class OfferServiceImpl implements OfferService {

	@Autowired
	private OfferInfoMapper mapper;

	@Override
	public void addOfferInfo(String title, String creatorId, String content) throws Exception {
		// TODO Auto-generated method stub
		OfferInfo info = new OfferInfo();
		Date createTime = new Date();
		int trustNumber = 3;
		int heat = 0;
		int commentsNumber = 0;
		info.setTitle(title);
		info.setCreatorId(creatorId);
		info.setCreateTime(createTime);
		info.setContent(content);
		info.setCreateTime(createTime);
		info.setTrustNumber(trustNumber);
		info.setHeat(heat);
		info.setCommentsNumber(commentsNumber);
		mapper.insertSelective(info);
	}

	@Override
	public void selectOfferOrderByDate(int limit) throws Exception {
		// TODO Auto-generated method stub

	}

}