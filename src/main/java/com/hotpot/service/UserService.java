package com.hotpot.service;

import java.util.List;

import com.hotpot.entity.User;

public interface UserService {
    void addUser(String id,String name ,String ip) throws Exception;

    User queryUserByName(String name) throws Exception;
    
    User queryUserByip(String ip) throws Exception;
    
    User queryUserByid(Integer id) throws Exception;
    
}
