package com.ppp.springboot.mapstructdemo.test;

import com.ppp.springboot.mapstructdemo.bo.UserDetailBO;
import com.ppp.springboot.mapstructdemo.convert.UserConvert;
import com.ppp.springboot.mapstructdemo.dataobject.UserDO;

/**
 * @author shkstart
 * @create 2022-02-19 20:55:47
 */
public class UserDetailBOTest {

    public static void main(String[] args) {
        UserDO userDO = new UserDO().setPassword("123456").setUsername("ynn")
                .setId(123);
        UserDetailBO userDetailBO = UserConvert.INSTANCE.convertDetail(userDO);
        System.out.println(userDetailBO.getUserId());
    }
}
