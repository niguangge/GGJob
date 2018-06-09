package com.hotpot.service;

import java.util.List;

import com.hotpot.entity.OfferInfo;

public interface OfferService {
	void addOfferInfo(String title, String category, String companyName, String education, String salaryMonth,
			String salaryYear, String content, int creatorId) throws Exception;

	List<OfferInfo> selectOfferOrderByDate(int limit, int offset) throws Exception;
	
	List<OfferInfo> selectOfferOrderByHeat(int limit, int offset) throws Exception;
	
	OfferInfo selectOfferById(int id) throws Exception;
	
	void addHeat(int heat,int id) throws Exception;
	
	int getCount() throws Exception;
}
