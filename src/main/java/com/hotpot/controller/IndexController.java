package com.hotpot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hotpot.entity.User;
import com.hotpot.service.IUserService;

@RestController
@EnableAutoConfiguration
public class IndexController {

    @Autowired
    private IUserService userService;

    /**
     * 整合SSM框架
     */
    @RequestMapping("/ssm")
    public List<User> findAllUser() throws Exception{
    	System.out.println("in sb!");
        return userService.queryAllUser();
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public void findAllUser(@PathVariable Integer id) throws Exception{
        userService.deleteUser(id);
    }


    /**
     * 返回基本格式JSON格式数据
     * @return
     */
    @RequestMapping(value="/index",produces="text/plain;charset=UTF-8")
    public String index(){
        return "hello spring boot";
    }

    /**
     * 返回POJO对象
     * @return
     */
    @RequestMapping("/pojo")
    public User showUser(){
        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setBirthday("1990-02-20");
        user.setAddress("武当山");

        return user;
    }

    /**
     * 返回Map集合对象
     */
    @RequestMapping("/map")
    public Map<String, Object> showMap(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", "张三丰");
        map.put("gender", "男");
        map.put("username", "赵敏");
        map.put("gender", "女");
        return map;
    } 

    /**
     * 返回List集合对象
     */
    @RequestMapping("/list")
    public List<User> showList(){
        List<User> list = new ArrayList<User>();
        User u1 = new User();
        u1.setId(1);
        u1.setName("张三");
        u1.setAddress("武当山");
        u1.setBirthday("1990-02-20");

        User u2 = new User();
        u2.setId(2);
        u2.setName("李四");
        u2.setAddress("上海市");
        u2.setBirthday("1990-02-21");

        list.add(u1);
        list.add(u2);

        return list;
    } 
}