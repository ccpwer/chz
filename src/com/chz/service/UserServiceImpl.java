package com.chz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chz.dao.UserMapper;
import com.chz.pojo.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper usermapper;

	@Override
	public User queryUserByOpenid(String openid) {
		// TODO Auto-generated method stub
		User user = usermapper.queryUserByOpenid(openid);
		return user;
	}

	@Override
	public Integer updateUser(User user) {
		// TODO Auto-generated method stub
		Integer updateUser = usermapper.updateUser(user);
		return updateUser;
	}

	@Override
	public Integer addUser(User user) {
		// TODO Auto-generated method stub
		Integer addUser = usermapper.addUser(user);
		return addUser;
	}

}
