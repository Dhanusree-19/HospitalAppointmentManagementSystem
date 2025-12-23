package com.BIThospital.service;

import com.BIThospital.model.PatLogin;
import com.BIThospital.model.Patient;

public interface PatientService {
	public boolean add(Patient patient);
	public PatLogin authenticate(PatLogin patLogin);
}
