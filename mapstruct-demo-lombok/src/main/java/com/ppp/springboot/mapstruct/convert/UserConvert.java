package com.ppp.springboot.mapstruct.convert;

import com.ppp.springboot.mapstruct.bo.UserBO;
import com.ppp.springboot.mapstruct.dataobject.UserDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author shkstart
 * @create 2022-02-19 21:14:12
 */
@Mapper
public interface UserConvert {
    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    UserBO convert(UserDO userDO);
}
