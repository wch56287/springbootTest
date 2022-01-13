package com.ruantong.springboottest001.controller;

import com.ruantong.springboottest001.common.Result;
import com.ruantong.springboottest001.common.StatusCode;
import com.ruantong.springboottest001.pojo.User;
import com.ruantong.springboottest001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: WangChunHui
 * @Date: 2020-04-16 22:36
 * @Description:
 */
@RestController
@RequestMapping("/api")
public class UserController {

//    @Autowired
    @Resource
    private UserService userService;

    /**
     * 查询所有
     *
     * @return
     */
    @GetMapping
    public Result findAll() {
        List<User> userList = userService.findAll();
        return new Result(true, StatusCode.OK, "查询成功！", userList);
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result<User> findById(@PathVariable("id") Integer id) {
        User user = userService.findById(id);
        return new Result<>(true, StatusCode.OK, "查询成功", user);
    }

    /**
     * 添加
     *
     * @param user
     * @return
     */
    @PostMapping
    public Result add(@RequestBody User user) {
        userService.add(user);
        return new Result(true, StatusCode.OK, "添加成功", null);
    }

    /**
     * 修改
     *
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/{id}")
    public Result update(@PathVariable("id") Long id, @RequestBody User user) {
        user.setId(id);
        userService.update(user);
        return new Result(true, StatusCode.OK, "修改成功", null);
    }

    /**
     * 删除
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delById(@PathVariable("id") Integer id) {
        userService.delById(id);
        return new Result(true, StatusCode.OK, "删除成功", null);
    }
}
