package com.BIThospital.model;

public class Patient {
	private Integer patientId;
	private String patientName;
	private Integer phoneNo;
	private PatLogin patLogin;
	
	
	
	public Patient(Integer patientId, String patientName, Integer phoneNo, PatLogin patLogin) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.phoneNo = phoneNo;
		this.patLogin = patLogin;
	}

	public Patient(Integer patientId, String patientName, Integer phoneNo) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.phoneNo = phoneNo;
	}

	
	
	public PatLogin getPatLogin() {
		return patLogin;
	}

	public void setPatLogin(PatLogin patLogin) {
		this.patLogin = patLogin;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public Integer getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	
}
