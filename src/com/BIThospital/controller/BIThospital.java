package com.BIThospital.controller;

import com.BIThospital.dao.DoctorServiceImpl;
import com.BIThospital.dao.PatientServiceImpl;
import com.BIThospital.model.DocLogin;
import com.BIThospital.model.Doctor;
import com.BIThospital.model.PatLogin;
import com.BIThospital.model.Patient;
import com.BIThospital.service.DocotorService;

public class BIThospital {

	public static void main(String args[])
	{
		//DocotorService doctorService = new DoctorServiceImpl();
		//doctorService.add(new Doctor(null, "Samantha", "lungs", 123, new DocLogin(null, "sam", 1430)));
		
		PatientServiceImpl patientService = new PatientServiceImpl();
		patientService.add(new Patient(null,"Dhanu",567, new PatLogin(null, "Dhanusree", 000)));
		
	}
}
