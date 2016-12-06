package com.happyheng.cloud.controller;

import com.happyheng.cloud.entity.User;
import com.happyheng.cloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * User控制器
 * Created by happyheng on 16/12/6.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String hello() {
        return "Hello";
    }

    @RequestMapping("/saveUserName")
    public String saveUserName(@RequestParam(value = "username")String username){
        System.out.println("接受到的username为" + username);
        return "success";
    }

    @RequestMapping("/save")
    public User saveUser(String name, Integer age){
        User user = userRepository.save(new User(null,name,age));
        return user;
    }

}
