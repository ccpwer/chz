package com.chz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chz.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService asi;
	
	@RequestMapping(value="interIndex", method = RequestMethod.POST)
	public String interIndex(HttpServletRequest request, HttpServletResponse response,
			Model model) {
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		System.out.println(name);
		System.out.println(pwd);
		Boolean queryExistAdmin = asi.queryExistAdmin(name, pwd);
		if(queryExistAdmin) {
			model.addAttribute("name", name);
			model.addAttribute("pwd", pwd);
			return "/index.jsp";			
		}else {
			model.addAttribute("logininfo", "用户名不存在或密码错误");
			return "/login.jsp";
		}
	}

}
