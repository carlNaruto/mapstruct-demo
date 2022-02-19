package com.ppp.springboot.mapstructdemo.convert;

import com.ppp.springboot.mapstructdemo.bo.UserBO;
import com.ppp.springboot.mapstructdemo.bo.UserDetailBO;
import com.ppp.springboot.mapstructdemo.dataobject.UserDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;


/**
 * @author shkstart
 * @create 2022-02-19 20:40:39
 */
@Mapper
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    UserBO convert(UserDO userDO);

    @Mappings({
            @Mapping(source = "id",target = "userId")
    })
    UserDetailBO convertDetail(UserDO userDO);

}
