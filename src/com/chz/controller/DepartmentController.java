package com.chz.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chz.pojo.Keshi;
import com.chz.service.KeshiService;


@Controller
public class DepartmentController {
	
	@Autowired
	private KeshiService ksi;
	
	@RequestMapping(value="/getKeshi")
	@ResponseBody
	public List<Keshi> getKeshi(HttpServletRequest request, HttpServletResponse response) {
		List<Keshi> queryAllKeshi = ksi.queryAllKeshi();
		return queryAllKeshi;
	}

}
