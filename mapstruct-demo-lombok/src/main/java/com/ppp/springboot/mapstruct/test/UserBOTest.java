package com.ppp.springboot.mapstruct.test;

import com.ppp.springboot.mapstruct.bo.UserBO;
import com.ppp.springboot.mapstruct.convert.UserConvert;
import com.ppp.springboot.mapstruct.dataobject.UserDO;

/**
 * @author shkstart
 * @create 2022-02-19 21:15:41
 */
public class UserBOTest {
    public static void main(String[] args) {
        // 创建 UserDO 对象
        UserDO userDO = new UserDO()
                .setId(1).setUsername("ynn").setPassword("123456");
        // 进行转换
        UserBO userBO = UserConvert.INSTANCE.convert(userDO);
        System.out.println(userBO.getId());
        System.out.println(userBO.getUsername());
        System.out.println(userBO.getPassword());
    }
}
