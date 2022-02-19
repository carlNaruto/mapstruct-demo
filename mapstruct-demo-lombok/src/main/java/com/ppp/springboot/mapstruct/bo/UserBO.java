package com.ppp.springboot.mapstruct.bo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author shkstart
 * @create 2022-02-19 21:12:39
 */
@Data
@Accessors(chain = true)
public class UserBO {

    /** 用户编号 **/
    private Integer id;
    /** 用户名 **/
    private String username;
    /** 密码 **/
    private String password;

}