package com.chz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chz.dao.DoctorMapper;
import com.chz.pojo.Doctor;
import com.chz.util.SendEmail;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorMapper dm;

	@Override
	public Doctor queryDoctorByopenid(String openid) {
		// TODO Auto-generated method stub
		Doctor doctor = dm.queryDoctorByopenid(openid);
		return doctor;
	}

	@Override
	public Integer insertDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		Integer insertDoctor = dm.insertDoctor(doctor);
		return insertDoctor;
	}

	@Override
	public List<Doctor> getAllDoctorRequest() {
		// TODO Auto-generated method stub
		List<Doctor> allDoctorRequest = dm.getAllDoctorRequest();
		return allDoctorRequest;
	}

	@Override
	@Transactional
	public Integer doctorCheckByDid(String did) {
		// TODO Auto-generated method stub
		String email = dm.queryEmailBydid(did);
		Integer doctorCheckByDid = dm.doctorCheckByDid(did);
		String str = "���Ѿ�ͨ�����";
		sendMailVerification(email, str);
		return doctorCheckByDid;
	}

	@Override
	@Transactional
	public Integer deleteDoctorRequest(String did) {
		// TODO Auto-generated method stub
		String email = dm.queryEmailBydid(did);
		Integer deleteDoctorRequest = dm.deleteDoctorRequest(did);
//		if (email != null) {
		String str = "��Ǹ��������Ϣ��˲�ͨ�������������ƺ��ύ";
			sendMailVerification(email, str);
//		}
		return deleteDoctorRequest;
	}

	public void sendMailVerification(String email, String info) {
		System.out.println(email);

		if (email != null) {
			SendEmail sendEmail = new SendEmail();
			// ����Ҫ���͵�����
			sendEmail.setReceiveMailAccount(email);
			// ����10λ����֤��

			
			sendEmail.setInfo(info);
			try {
				sendEmail.Send();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
