package com.ruantong.springboottest001.controller;


import com.ruantong.springboottest001.Springboottest001Application;
import com.ruantong.springboottest001.pojo.User;
import com.ruantong.springboottest001.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * @Author: WangChunHui
 * @Date: 2020-08-23 14:37
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Springboottest001Application.class)
class UserControllerTest {
    @Autowired
    private UserService userService;

    @Test
    void findAll() {
        List<User> userList = userService.findAll();
        System.out.println(userList);
    }

    @Test
    void findById() {
    }

    @Test
    void add() {
    }

    @Test
    void update() {
    }

    @Test
    void delById() {
    }
}