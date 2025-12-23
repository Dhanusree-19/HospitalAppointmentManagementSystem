package com.BIThospital.model;

public class Doctor {
	private Integer  doctorId ;
	private String doctorName;
	private String dept;
	private Integer phoneNo;
	private DocLogin docLogin;
	
	
	
	public Doctor(Integer doctorId, String doctorName, String dept, int i, DocLogin docLogin) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.dept = dept;
		this.phoneNo = i;
		this.docLogin = docLogin;
	}


	public Doctor(Integer doctor_id, String doctor_name, String dept, Integer phoneNo) {
		super();
		this.doctorId = doctor_id;
		this.doctorName = doctor_name;
		this.dept = dept;
		this.phoneNo = phoneNo;
	}

	

	public DocLogin getDocLogin() {
		return docLogin;
	}


	public void setDocLogin(DocLogin docLogin) {
		this.docLogin = docLogin;
	}


	public Integer getDoctor_id() {
		return doctorId;
	}


	public void setDoctor_id(Integer doctor_id) {
		this.doctorId = doctor_id;
	}


	public String getDoctor_name() {
		return doctorName;
	}


	public void setDoctor_name(String doctor_name) {
		this.doctorName = doctor_name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public Integer getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}


	
	
	
	
	

}
