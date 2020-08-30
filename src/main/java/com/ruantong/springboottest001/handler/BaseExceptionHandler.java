package com.ruantong.springboottest001.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @Author: WangChunHui
 * @Date: 2020-04-16 22:36
 * @Description:统一异常处理类
 */

/**
 * 声明该类是一个增强类
 */
@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String error(Exception e){
        e.printStackTrace();
        return "当前系统繁忙,请您稍后重试";
    }
}
