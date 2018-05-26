package com.hotpot.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hotpot.service.UserService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public void findAllUser(HttpServletRequest request) throws Exception {
		String name = request.getParameter("name");
		String ip = request.getParameter("ip");
		userService.addUser(name, ip);
	}
}
