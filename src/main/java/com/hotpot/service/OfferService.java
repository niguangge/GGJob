package com.hotpot.service;

import java.util.Date;

public interface OfferService {
	void addOfferInfo(String title, String creatorId, String content) throws Exception;

	void selectOfferOrderByDate(int limit) throws Exception;
}
