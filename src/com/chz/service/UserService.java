package com.chz.service;

import org.apache.ibatis.annotations.Param;

import com.chz.pojo.User;

public interface UserService {
	
	User queryUserByOpenid(@Param("openid") String openid);
	
	Integer updateUser(User user);

	Integer addUser(User user);
}
