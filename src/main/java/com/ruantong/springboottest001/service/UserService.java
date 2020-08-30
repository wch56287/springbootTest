package com.ruantong.springboottest001.service;
import com.ruantong.springboottest001.pojo.User;
import java.util.List;

/**
 * @Author: WangChunHui
 * @Date: 2020-04-16 22:37
 * @Description:
 */
public interface UserService {
    /**
     * 查询所有
     */
    List<User> findAll();

    User findById(Integer id);

    void add(User user);

    void update(User user);

    void delById(Integer id);
}
