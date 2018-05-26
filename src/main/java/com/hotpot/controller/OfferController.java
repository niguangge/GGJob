package com.hotpot.controller;

import java.util.Date;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotpot.service.OfferService;
import com.hotpot.service.UserService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/offer")
public class OfferController {

	@Autowired
	private OfferService offerService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public void findAllUser(HttpServletRequest request) throws Exception {
		String title = request.getParameter("title");
		String creatorId = request.getParameter("userId");
		String content = request.getParameter("content");
		offerService.addOfferInfo(title, creatorId, content);
	}
}
