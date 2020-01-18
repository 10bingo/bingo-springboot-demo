package com.bingo.dds.controller;

import com.bingo.dds.bean.User;
import com.bingo.dds.config.DataSource;
import com.bingo.dds.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description: UserController
 * Author: bingo
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/master/all")
    @DataSource("master")
    public List<User> findAll(){
        List<User> all = userMapper.findAll();
        return all;
    }

    @RequestMapping("/slave/all")
    @DataSource("slave")
    public List<User> findAll2(){
        List<User> all = userMapper.findAll();
        return all;
    }
}
