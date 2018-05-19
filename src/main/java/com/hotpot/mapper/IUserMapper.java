package com.hotpot.mapper;

import java.util.List;

import com.hotpot.entity.User;

public interface IUserMapper {

    List<User> queryAllUser() throws Exception;

    void deleteUser(Integer id) throws Exception;
}