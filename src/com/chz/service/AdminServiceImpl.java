package com.chz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chz.dao.AdminMapper;
import com.chz.pojo.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminMapper am;

	@Override
	public Boolean queryExistAdmin(String a_number, String a_password) {
		// TODO Auto-generated method stub
		Admin admin = am.queryExistAdmin(a_number, a_password);
		if(admin!=null) {
			return true;			
		}else {
			return false;
		}
	}

}
