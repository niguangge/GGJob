package com.hotpot.service;

import java.util.List;

import com.hotpot.entity.User;

public interface IUserService {

    List<User> queryAllUser() throws Exception;

    void deleteUser(Integer id) throws Exception;
}

