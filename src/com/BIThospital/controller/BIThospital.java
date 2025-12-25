package com.BIThospital.controller;

import com.BIThospital.dao.BookingServiceImpl;
import com.BIThospital.dao.DoctorAvailabilityServiceImpl;
import com.BIThospital.dao.DoctorServiceImpl;
import com.BIThospital.dao.PatientServiceImpl;
import com.BIThospital.model.Booking;
import com.BIThospital.model.BookingStatus;
import com.BIThospital.model.DocLogin;
import com.BIThospital.model.Doctor;
import com.BIThospital.model.DoctorAvailability;
import com.BIThospital.model.PatLogin;
import com.BIThospital.model.Patient;
import com.BIThospital.service.BookingService;
import com.BIThospital.service.DocotorService;
import com.BIThospital.service.DoctorAvailabilityService;

public class BIThospital {

	public static void main(String args[])
	{
		//DocotorService doctorService = new DoctorServiceImpl();
		//doctorService.add(new Doctor(null, "Samantha", "lungs", 123, new DocLogin(null, "sam", 1430)));
		
		//PatientService patientService = new PatientServiceImpl();
		//patientService.add(new Patient(null,"Dhanu",567, new PatLogin(null, "Dhanusree", 000)));
		
		//DoctorAvailabilityService docAvailabilityService=new DoctorAvailabilityServiceImpl ();
		//docAvailabilityService.add(new DoctorAvailability(1,null, "2025-12-12","11:00:00"));
		
		BookingService bookingService = new BookingServiceImpl();
		bookingService.add(new Booking(1,1,2,null,BookingStatus.CONFIRM));
		
	}
}
