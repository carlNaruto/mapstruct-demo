package com.ppp.springboot.mapstructdemo.test;

import com.ppp.springboot.mapstructdemo.bo.UserBO;
import com.ppp.springboot.mapstructdemo.convert.UserConvert;
import com.ppp.springboot.mapstructdemo.dataobject.UserDO;

/**
 * @author shkstart
 * @create 2022-02-19 20:45:22
 */
public class UserBOTest {
    public static void main(String[] args) {
        UserDO userDO = new UserDO().setId(11)
                .setUsername("ynn")
                .setPassword("123456");

        UserBO userBO = UserConvert.INSTANCE.convert(userDO);
        System.out.println(userBO.getId());
        System.out.println(userBO.getUsername());
        System.out.println(userBO.getPassword());

    }
}
