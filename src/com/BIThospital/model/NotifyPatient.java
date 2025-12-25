package com.BIThospital.model;

public class NotifyPatient {
	private Integer patientId;
    private Integer doctorId;
    private Integer bookingId;
    private String message;
	public NotifyPatient(Integer patientId, Integer doctorId, Integer bookingId, String message) {
		super();
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.bookingId = bookingId;
		this.message = message;
	}
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
    
}
