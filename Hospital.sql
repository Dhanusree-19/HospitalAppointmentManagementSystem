CREATE DATABASE IF NOT EXISTS bithospital;
USE bithospital;

CREATE TABLE bithospital.registerPat(
    patient_id INT  PRIMARY KEY AUTO_INCREMENT,
    patient_name VARCHAR(250) NOT NULL,
    phone_number INT NOT NULL
);

CREATE TABLE bithospital.registerDoc(
    doctor_id INT  PRIMARY KEY AUTO_INCREMENT,
    doctor_name VARCHAR(250) NOT NULL,
    dept VARCHAR(100),
    phone_number INT NOT NULL
);

CREATE TABLE bithospital.loginPat(
    patient_id INT,
    patient_name VARCHAR(250) NOT NULL,
    pin INT NOT NULL,
    FOREIGN KEY (patient_id) REFERENCES registerPat(patient_id)
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

CREATE TABLE bithospital.loginDoc(
    doctor_id INT,
    doctor_name VARCHAR(250) NOT NULL,
    pin INT,
    FOREIGN KEY (doctor_id) REFERENCES registerDoc(doctor_id)
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

CREATE TABLE bithospital.availabilityDoc(
    doctor_id INT,
    a_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    a_date date NOT NULL,
    a_time time NOT NULL,
    FOREIGN KEY (doctor_id) REFERENCES registerDoc(doctor_id)
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

CREATE TABLE bithospital.booking(
	booking_id INT AUTO_INCREMENT,
    patient_id INT,
    doctor_id INT,
    a_id INT,
    booking_confirmation ENUM('confirm','cancel'),
    PRIMARY KEY (booking_id),
    FOREIGN KEY (patient_id) REFERENCES registerPat(patient_id)
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    FOREIGN KEY (doctor_id) REFERENCES registerDoc(doctor_id)
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    FOREIGN KEY (a_id) REFERENCES availabilityDoc(a_id)
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

CREATE TABLE bithospital.notifydoctor(
    patient_id INT,
    doctor_id INT,
    booking_id INT,
    d_message TEXT,
    PRIMARY KEY (booking_id),
    FOREIGN KEY (patient_id) REFERENCES registerPat(patient_id)
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    FOREIGN KEY (doctor_id) REFERENCES registerDoc(doctor_id)
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    FOREIGN KEY (booking_id) REFERENCES booking(booking_id)
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

CREATE TABLE bithospital.notifypatient(
    patient_id INT,
    doctor_id INT,
    booking_id INT,
    p_message TEXT,
    PRIMARY KEY (booking_id),
    FOREIGN KEY (patient_id) REFERENCES registerPat(patient_id)
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    FOREIGN KEY (doctor_id) REFERENCES registerDoc(doctor_id)
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    FOREIGN KEY (booking_id) REFERENCES booking(booking_id)
        ON UPDATE CASCADE
        ON DELETE CASCADE
);


-- select* from bithospital.registerDoc;
-- select* from bithospital.loginDoc;

select* from bithospital.registerPat;

select* from bithospital.availabilityDoc;

