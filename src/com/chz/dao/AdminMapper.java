package com.chz.dao;

import org.apache.ibatis.annotations.Param;

import com.chz.pojo.Admin;

public interface AdminMapper {
	Admin queryExistAdmin(@Param("a_number")String a_number, @Param("a_password")String a_password);
}
