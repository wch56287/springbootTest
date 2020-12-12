package com.ruantong.springboottest001.service.impl;

import com.ruantong.springboottest001.dao.UserMapper;
import com.ruantong.springboottest001.pojo.User;
import com.ruantong.springboottest001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: WangChunHui
 * @Date: 2020-04-16 22:37
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有
     */
    @Override
    public List<User> findAll() {
        List<User> users = userMapper.selectAll();
        return users;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void delById(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }
}
