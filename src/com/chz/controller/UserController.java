package com.chz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chz.pojo.User;
import com.chz.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService usi;
	
	@RequestMapping(value="/getUserInfo")
	@ResponseBody
	public User getUserInfo(HttpServletRequest request, HttpServletResponse response) {
		String openid = request.getParameter("openid");
		User user = usi.queryUserByOpenid(openid);
		return user;
	}
	
	@RequestMapping(value="/changeUserInfo")
	@ResponseBody
	public void changeUserInfo(HttpServletRequest request, HttpServletResponse response, 
			@RequestBody User user) {
		System.out.println(user);
		usi.updateUser(user);
	}
	
	@RequestMapping(value="/addUserInfo")
	@ResponseBody
	public void addUserInfo(HttpServletRequest request, HttpServletResponse response, 
			@RequestBody User user) {
		System.out.println(user);
		usi.addUser(user);
	}
}
