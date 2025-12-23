package com.BIThospital.service;

import com.BIThospital.model.DocLogin;
import com.BIThospital.model.Doctor;

public interface DocotorService {
	public boolean add(Doctor doctor);
	public DocLogin authenticate(DocLogin docLogin);
}
