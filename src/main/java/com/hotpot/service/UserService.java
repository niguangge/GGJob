package com.hotpot.service;

import java.util.List;

import com.hotpot.entity.UserInfo;

public interface UserService {
    void addUser(String name ,String ip) throws Exception;

    UserInfo queryUserByName(String name) throws Exception;
    
    UserInfo queryUserByip(String ip) throws Exception;
    
    UserInfo queryUserByid(Integer id) throws Exception;
    
}
