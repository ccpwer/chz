package com.chz.service;

import org.apache.ibatis.annotations.Param;


public interface AdminService {

	Boolean queryExistAdmin(@Param("a_number")String a_number, @Param("a_password")String a_password);
}
