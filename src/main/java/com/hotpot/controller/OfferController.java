package com.hotpot.controller;


import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hotpot.service.OfferService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/offer")
public class OfferController {

	@Autowired
	private OfferService offerService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public void findAllUser(HttpServletRequest request) throws Exception {
		String title = request.getParameter("title");
		int creatorId = Integer.parseInt(request.getParameter("user_id"));
		String content = request.getParameter("content");
		String category = request.getParameter("category");
		String companyName = request.getParameter("company_name");
		String eduation = request.getParameter("eduation");
		String salaryMonth = request.getParameter("salary_month");
		String salaryYear = request.getParameter("salary_year");
		offerService.addOfferInfo(title, category, companyName, eduation, salaryMonth, salaryYear, content, creatorId);
	}
}
