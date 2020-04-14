package com.chz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chz.dao.TestMapper;
import com.chz.pojo.Test;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestMapper tm;

	@Override
	public List<Test> querytest() {
		// TODO Auto-generated method stub
		List<Test> querytest = tm.querytest();
		return querytest;
	}
}
