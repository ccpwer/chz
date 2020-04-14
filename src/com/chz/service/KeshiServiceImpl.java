package com.chz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chz.dao.KeshiMapper;
import com.chz.pojo.Keshi;

@Service
public class KeshiServiceImpl implements KeshiService {

	@Autowired
	private KeshiMapper km;
	
	@Override
	public List<Keshi> queryAllKeshi() {
		// TODO Auto-generated method stub
		List<Keshi> queryAllKeshi = km.queryAllKeshi();
		return queryAllKeshi;
	}

}
