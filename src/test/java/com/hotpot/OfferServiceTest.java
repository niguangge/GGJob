package com.hotpot;

import org.springframework.beans.factory.annotation.Autowired;

import com.hotpot.service.OfferService;

public class OfferServiceTest {
	@Autowired
	private OfferService offerService;

	public void testAddOfferInfo() throws Exception {
		String title = "test";
		String category = "IT";
		String companyName = "hotPot";
		String education = "docter";
		String salaryMonth = "20*20";
		String salaryYear = "40";
		String content = "每周末搞锅！";
		int creatorId = 0;
		offerService.addOfferInfo(title, category, companyName, education, salaryMonth, salaryYear, content, creatorId);
	}

	public void testSelectOfferOrderByDate() throws Exception {
		int limit = 20;
		int offset = 0;
		offerService.selectOfferOrderByDate(limit,offset);
	}
}
