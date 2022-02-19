package com.ppp.springboot.mapstruct.convert;

import com.ppp.springboot.mapstruct.bo.UserBO;
import com.ppp.springboot.mapstruct.dataobject.UserDO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-19T21:16:23+0800",
    comments = "version: 1.4.0.Beta3, compiler: javac, environment: Java 1.8.0_40 (Oracle Corporation)"
)
public class UserConvertImpl implements UserConvert {

    @Override
    public UserBO convert(UserDO userDO) {
        if ( userDO == null ) {
            return null;
        }

        UserBO userBO = new UserBO();

        userBO.setId( userDO.getId() );
        userBO.setUsername( userDO.getUsername() );
        userBO.setPassword( userDO.getPassword() );

        return userBO;
    }
}
