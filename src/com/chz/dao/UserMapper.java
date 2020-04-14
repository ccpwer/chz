package com.chz.dao;

import org.apache.ibatis.annotations.Param;

import com.chz.pojo.User;

public interface UserMapper {

	User queryUserByOpenid(@Param("openid") String openid);
	
	Integer updateUser(User user);
	
	Integer addUser(User user);
}
