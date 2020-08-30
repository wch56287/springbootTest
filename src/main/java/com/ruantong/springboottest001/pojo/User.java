package com.ruantong.springboottest001.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Author: WangChunHui
 * @Date: 2020-04-16 22:33
 * @Description:
 */
@Table(name = "user001")
@Data
public class User implements Serializable {
    @Id
    private Integer id;
    private String username;
    private String password;
}
