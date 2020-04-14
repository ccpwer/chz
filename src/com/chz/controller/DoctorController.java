package com.chz.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chz.pojo.Doctor;
import com.chz.service.DoctorService;

@Controller
public class DoctorController {

	@Autowired
	private DoctorService dsi;

	// ҽ��ע��
	@RequestMapping(value = "/setDoctorRegister")
	public void setDoctorRegister(HttpServletRequest request, HttpServletResponse response,
			@RequestBody Doctor doctor) {
		System.out.println(doctor);
		doctor.setUniacid(1);
		dsi.insertDoctor(doctor);
	}

	// �ж��Ƿ���ڸ�ҽ��
	@RequestMapping(value = "/getDoctorEver")
	@ResponseBody
	public String getDoctorEver(HttpServletRequest request, HttpServletResponse response) {
		String openid = request.getParameter("openid");
		System.out.println(openid);
		Doctor doctor = dsi.queryDoctorByopenid(openid);
		if (doctor == null) {
			// û�и�ҽ����¼�򷵻�0
			return "0";
		} else {
			System.out.println(doctor.getD_checked());
			if (doctor.getD_checked()) {
				// ͨ����˷���1
				return "1";
			} else {
				// û��ͨ����˷���2
				return "2";
			}
		}
	}

	// ��ȡҽ����Ϣ
	@RequestMapping(value = "/getDoctorInfo")
	@ResponseBody
	public Doctor getDoctorInfo(HttpServletRequest request, HttpServletResponse response) {
		String openid = request.getParameter("openid");
		System.out.println(openid);
		Doctor doctor = dsi.queryDoctorByopenid(openid);
		return doctor;
	}

	// ��̨��Աҽ�������б�
	@RequestMapping(value = "/getDoctorRequest")
	public String getDoctorRequest(Model model) {
		List<Doctor> allDoctorRequest = dsi.getAllDoctorRequest();
		model.addAttribute("doctorRequestList", allDoctorRequest);
		return "doctorRequest.jsp";
	}

	// ��̨��Աͨ��ҽ������
	@RequestMapping(value = "/passDoctorRequest")
	public String passDoctorRequest(String did) {
		System.out.println(did);
		dsi.doctorCheckByDid(did);
		return "/getDoctorRequest";
	}

	// ��̨��Ա����ҽ������
	@RequestMapping(value = "/deleteDoctorRequest")
	public String deleteDoctorRequest(String did) {
		System.out.println(did);
		dsi.deleteDoctorRequest(did);
		return "/getDoctorRequest";
	}

}