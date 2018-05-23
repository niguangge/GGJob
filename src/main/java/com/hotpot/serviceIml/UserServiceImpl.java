package com.hotpot.serviceIml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotpot.entity.User;
import com.hotpot.mapper.IUserMapper;
import com.hotpot.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private IUserMapper mapper;

    public List<User> queryAllUser() throws Exception {
        return mapper.queryAllUser();
    }

    public void deleteUser(Integer id) throws Exception {
        mapper.deleteUser(id);
    }

}