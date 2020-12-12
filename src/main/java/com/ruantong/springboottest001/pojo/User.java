package com.ruantong.springboottest001.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: WangChunHui
 * @Date: 2020-04-16 22:33
 * @Description:
 */
@Table(name = "user")
@Data
public class User implements Serializable {
    @Id
    private Long id;
    private String name;
    private Integer age;

}
