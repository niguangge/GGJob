package com.hotpot.service;

public interface OfferService {
	void addOfferInfo(String title, String category, String companyName, String eduation, String salaryMonth,
			String salaryYear, String content, int creatorId) throws Exception;

	void selectOfferOrderByDate(int limit) throws Exception;
}
