package com.BIThospital.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.BIThospital.model.DocLogin;
import com.BIThospital.model.Doctor;
import com.BIThospital.service.DocotorService;

public class DoctorServiceImpl implements DocotorService {
	private String sql = null;
	@Override
	public boolean add(Doctor doctor) {
		try {
		Connection connection = SqlManager.getConnection();
		sql = "insert into  bithospital.registerDoc (doctor_name,  dept, phone_number) values (?, ?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		preparedStatement.setString(1, doctor.getDoctor_name());
		preparedStatement.setString(2, doctor.getDept());
		preparedStatement.setInt(3, doctor.getPhoneNo());
		if(preparedStatement.executeUpdate() > 0) {
			ResultSet resultSet = preparedStatement.getGeneratedKeys();
			if(resultSet.next()) {
				doctor.setDoctor_id(resultSet.getInt(1));
				sql = "insert into bithospital.loginDoc (doctor_name,doctor_id, pin) values (?, ?, ?)";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, doctor.getDocLogin().getDoctorName());
				preparedStatement.setInt(2, doctor.getDoctor_id());
				preparedStatement.setInt(3, doctor.getDocLogin().getPin());
				
				if(preparedStatement.executeUpdate() > 0) {
					return true;
				}					
			}
		}
	} catch(SQLException ex) {
		System.err.println("Exception raised during connection : " + ex.getMessage());
	}
	return false;
		
	}

	@Override
	public DocLogin authenticate(DocLogin docLogin) {
		try {
			Connection connection = SqlManager.getConnection();
			sql = "select doctor_id from bithospital.loginDoc where doctor_name = '" + docLogin.getDoctorName()
					+ "' AND pin = " + docLogin.getPin();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			if(resultSet.next()) {
				docLogin.setDoctorId(resultSet.getInt("DoctorId"));
				docLogin.setPin(null);
				return docLogin;
			}
		} catch (SQLException ex) {
			System.err.println("Exception raised during connection : " + ex.getMessage());
		}

		return null;
	}

}
