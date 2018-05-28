package com.hotpot.service;

import com.hotpot.entity.UserInfo;

public interface UserService {
    void addUser(String wxId, String name, String ip) throws Exception;

    UserInfo queryUserByName(String name) throws Exception;
    
    UserInfo queryUserByip(String ip) throws Exception;
    
    UserInfo queryUserByid(Integer id) throws Exception;
    
    UserInfo queryUserByWxId(Integer wxId) throws Exception;
}
