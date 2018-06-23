
package com.hotpot.service;

import java.util.List;

import com.hotpot.entity.OfferInfo;
import com.hotpot.entity.UserCollect;

public interface OfferService {
	void addOfferInfo(String title, String category, String companyName, String city, String position, String eduation,
			String salaryMonth, String salaryYear, String content, int creatorId) throws Exception;

	List<OfferInfo> selectOfferOrderByDate(int limit, int offset) throws Exception;

	List<OfferInfo> selectOfferOrderByHeat(int limit, int offset) throws Exception;

	OfferInfo selectOfferById(int id) throws Exception;

	List<OfferInfo> selectOfferByIndex(String index, String value, int limit, int offset) throws Exception;

	List<OfferInfo> selectOfferByValue(String value, int limit, int offset) throws Exception;

	void addHeat(int heat, int id) throws Exception;

	int getCount() throws Exception;

	List<UserCollect> selectCollectByUserId(int userId, int limit) throws Exception;

	void addCollect(UserCollect userCollect) throws Exception;
}
