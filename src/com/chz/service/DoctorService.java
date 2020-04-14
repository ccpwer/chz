package com.chz.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chz.pojo.Doctor;

public interface DoctorService {

	Doctor queryDoctorByopenid(@Param("openid") String openid);

	Integer insertDoctor(Doctor doctor);

	List<Doctor> getAllDoctorRequest();

	Integer doctorCheckByDid(@Param("did") String did);

	Integer deleteDoctorRequest(@Param("did") String did);
}
