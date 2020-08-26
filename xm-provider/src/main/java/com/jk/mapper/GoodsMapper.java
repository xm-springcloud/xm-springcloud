package com.jk.mapper;

import com.jk.model.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface GoodsMapper {
    @Select("select * from t_user where account = #{value}")
    UserBean findUserInfoByAccount(String account);
}
