package com.User.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.Data;

//@Data
@Entity
@Table(name = "user")
public class UserDtls {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String fullName;

	private String email;

	private String address;

	private String qualification;

	private String password;
	
	private String DoB;
	
	private String role;
	
	private String mobileNumber;

	private String verification;
	
	

	public String getVerification() {
		return verification;
	}

	public void setVerification(String verification) {
		this.verification = verification;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDoB() {
		return DoB;
	}

	public void setDoB(String doB) {
		DoB = doB;
	}

	public UserDtls(String fullName, String email, String address, String qualification, String password, String doB) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.address = address;
		this.qualification = qualification;
		this.password = password;
		DoB = doB;
	}

	public UserDtls() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}