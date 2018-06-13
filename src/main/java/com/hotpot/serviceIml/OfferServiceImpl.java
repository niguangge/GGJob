package com.hotpot.serviceIml;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotpot.entity.OfferInfo;
import com.hotpot.entity.UserCollect;
import com.hotpot.mapper.OfferInfoMapper;
import com.hotpot.mapper.UserCollectMapper;
import com.hotpot.service.OfferService;

@Service
public class OfferServiceImpl implements OfferService {

	@Autowired
	private OfferInfoMapper mapper;

	@Autowired
	private UserCollectMapper collectMapper;

	public void addOfferInfo(String title, String category, String companyName, String city, String position,
			String eduation, String salaryMonth, String salaryYear, String content, int creatorId) throws Exception {
		OfferInfo info = new OfferInfo();
		Date createTime = new Date();
		int trust = 3;
		int heat = 0;
		int commentsNumber = 0;
		info.setTitle(title);
		info.setCategory(category);
		info.setCompanyName(companyName);
		info.setCity(city);
		info.setPosition(position);
		info.setEducation(eduation);
		info.setCreatorId(creatorId);
		info.setCreateTime(createTime);
		info.setExternalContent(content);
		info.setCreateTime(createTime);
		info.setTrust(trust);
		info.setHeat(heat);
		info.setSalaryMonth(salaryMonth);
		info.setSalaryYear(salaryYear);
		info.setCommentNumber(commentsNumber);
		mapper.insertSelective(info);
	}

	public List<OfferInfo> selectOfferOrderByDate(int limit, int offset) throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectOfferOrderByDate(limit, offset);
	}

	public List<OfferInfo> selectOfferOrderByHeat(int limit, int offset) throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectOfferOrderByHeat(limit, offset);
	}

	@Override
	public OfferInfo selectOfferById(int id) throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectOfferById(id);
	}

	@Override
	public int getCount() throws Exception {
		// TODO Auto-generated method stub
		return mapper.getCount();
	}

	@Override
	public void addHeat(int heat, int id) throws Exception {
		// TODO Auto-generated method stub
		mapper.addHeat(heat, id);
	}

	@Override
	public List<UserCollect> selectCollectByUserId(int userId, int limit) throws Exception {
		return collectMapper.selectByUserId(userId, limit);
	}

	@Override
	public void addCollect(UserCollect userCollect) throws Exception {
		collectMapper.insert(userCollect);
	}
}
