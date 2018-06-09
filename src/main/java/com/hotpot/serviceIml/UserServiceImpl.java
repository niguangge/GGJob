package com.hotpot.serviceIml;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotpot.entity.UserInfo;
import com.hotpot.mapper.UserInfoMapper;
import com.hotpot.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserInfoMapper mapper;

	public void addUser(String wxId, String name, String ip) throws Exception {
		UserInfo record = new UserInfo();
		record.setWxId(wxId);
		record.setUserName(name);
		record.setUserIp(ip);
		Date currentTime = new Date();
		record.setLatestLoginTime(currentTime);
		record.setRegistrationTime(currentTime);
		mapper.insertSelective(record);
	}

	public UserInfo queryUserByName(String name) throws Exception {
		return null;

	}

	public UserInfo queryUserByip(String ip) throws Exception {
		return null;

	}

	public UserInfo queryUserByid(Integer id) throws Exception {
		return null;

	}
	
	public UserInfo queryUserByWxId(Integer wxId) throws Exception{
		return null;
	}

}