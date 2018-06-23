package com.hotpot.controller;

import java.util.Date;
import java.util.List;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hotpot.entity.OfferInfo;
import com.hotpot.entity.UserCollect;
import com.hotpot.service.OfferService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/offer")
public class OfferController {

	@Autowired
	private OfferService offerService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public void addUser(HttpServletRequest request) throws Exception {
		String title = request.getParameter("title");
		int creatorId = Integer.parseInt(request.getParameter("user_id"));
		String content = request.getParameter("content");
		String category = request.getParameter("category");
		String companyName = request.getParameter("company_name");
		String city = request.getParameter("city");
		String position = request.getParameter("position");
		String eduation = request.getParameter("eduation");
		String salaryMonth = request.getParameter("salary_month");
		String salaryYear = request.getParameter("salary_year");
		offerService.addOfferInfo(title, category, companyName, city, position, eduation, salaryMonth, salaryYear,
				content, creatorId);
	}

	@RequestMapping(value = "/select/date", method = RequestMethod.GET)
	public List<OfferInfo> selectUserByDate(HttpServletRequest request) throws Exception {
		String limitStr = request.getParameter("limit");
		String offsetStr = request.getParameter("offset");
		int limit = 10;
		int offset = 0;
		if (limitStr != null) {
			limit = Integer.parseInt(limitStr);
		}
		if (offsetStr != null) {
			offset = Integer.parseInt(offsetStr);
		}
		return offerService.selectOfferOrderByDate(limit, offset);
	}

	@RequestMapping(value = "/select/heat", method = RequestMethod.GET)
	public List<OfferInfo> selectUserByHeat(HttpServletRequest request) throws Exception {
		String limitStr = request.getParameter("limit");
		String offsetStr = request.getParameter("offset");
		int limit = 10;
		int offset = 0;
		if (limitStr != null) {
			limit = Integer.parseInt(limitStr);
		}
		if (offsetStr != null) {
			offset = Integer.parseInt(offsetStr);
		}
		return offerService.selectOfferOrderByHeat(limit, offset);
	}

	@RequestMapping(value = "/select/count", method = RequestMethod.GET)
	public int getCount(HttpServletRequest request) throws Exception {
		return offerService.getCount();
	}

	@RequestMapping(value = "/select/id", method = RequestMethod.GET)
	public OfferInfo selectUserById(HttpServletRequest request) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		/*
		 * if (id == null) { limit = Integer.parseInt(limitStr); }
		 */

		System.out.println("gaifaiID");
		return offerService.selectOfferById(id);
	}

	@RequestMapping(value = "/search/{index}", method = RequestMethod.GET)
	public List<OfferInfo> searchByIndex(@PathVariable("index") String index, HttpServletRequest request)
			throws Exception {
		String value = request.getParameter("value");
		String limitStr = request.getParameter("limit");
		String offsetStr = request.getParameter("offset");
		int limit = 10;
		int offset = 0;
		if (limitStr != null) {
			limit = Integer.parseInt(limitStr);
		}
		if (offsetStr != null) {
			offset = Integer.parseInt(offsetStr);
		}
		return offerService.selectOfferByIndex(index, value, limit, offset);
	}
	
	@RequestMapping(value = "/multiSearch", method = RequestMethod.GET)
	public List<OfferInfo> multiSearchByValue(HttpServletRequest request)
			throws Exception {
		String value = request.getParameter("value");
		String limitStr = request.getParameter("limit");
		String offsetStr = request.getParameter("offset");
		int limit = 10;
		int offset = 0;
		if (limitStr != null) {
			limit = Integer.parseInt(limitStr);
		}
		if (offsetStr != null) {
			offset = Integer.parseInt(offsetStr);
		}
		return offerService.selectOfferByValue(value, limit, offset);
	}

	@RequestMapping(value = "/get/AVGsalary/{index}", method = RequestMethod.GET)
	public float getAVGSalaryByIndex(@PathVariable("index") String index, HttpServletRequest request) throws Exception {
		String value = request.getParameter("value");
		List<OfferInfo> list = offerService.selectOfferByIndex(index, value, -1, -1);
		int offerNumber = 0;
		float salaryCount = 0;
		for (int i = 0; i < list.size(); i++) {
			String salaryYearStr = list.get(i).getSalaryYear();
			float salaryYear = 0;
			if (salaryYearStr.endsWith("w") || salaryYearStr.endsWith("W")) {
				salaryYear = Float.parseFloat(salaryYearStr.substring(0, salaryYearStr.length() - 1));
				salaryCount += salaryYear;
				offerNumber++;
			}
		}

		return salaryCount / offerNumber;
	}

	@RequestMapping(value = "/add/heat", method = RequestMethod.GET)
	public void addHeatById(HttpServletRequest request) throws Exception {
		int id = Integer.parseInt(request.getParameter("id"));
		OfferInfo info = offerService.selectOfferById(id);
		int heat = info.getHeat();
		heat++;
		offerService.addHeat(heat, id);
	}

	@RequestMapping(value = "/get/collect", method = RequestMethod.GET)
	public List<UserCollect> getCollectByUserId(HttpServletRequest request) throws Exception {
		int userId = Integer.parseInt(request.getParameter("userId"));
		String limitStr = request.getParameter("limit");
		int limit = 10;
		if (limitStr != null) {
			limit = Integer.parseInt(limitStr);
		}
		return offerService.selectCollectByUserId(userId, limit);
	}

	@RequestMapping(value = "/add/collect", method = RequestMethod.GET)
	public void addCollect(HttpServletRequest request) throws Exception {
		int userId = Integer.parseInt(request.getParameter("userId"));
		int offerId = Integer.parseInt(request.getParameter("offerId"));
		Date collectTime = new Date();
		UserCollect userCollect = new UserCollect();
		userCollect.setUserId(userId);
		userCollect.setOfferId(offerId);
		userCollect.setCollectTime(collectTime);
		offerService.addCollect(userCollect);
	}

}
