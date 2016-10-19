package com.ems.domain;

public class User {

	 private String userName;
	 private String passWord;	
	 private String firstName;
	 private String lastName;
	 private String dateOfBirth;
	 private String address;
	 private String country;
	 private String PIN;
	 private String phone;
	 private String gender;
	 private String city;
	 private String state;
	 private String emailId;



	 public String getFirstName() {
	  return firstName;
	 }

	 public void setFirstName(String firstName) {
	  this.firstName = firstName;
	 }

	 public String getLastName() {
	  return lastName;
	 }

	 public void setLastName(String lastName) {
	  this.lastName = lastName;
	 }

	 public String getGender() {
	  return gender;
	 }

	 public void setGender(String gender) {
	  this.gender = gender;
	 }

	 public String getCity() {
	  return city;
	 }

	 public void setCity(String city) {
	  this.city = city;
	 }

	 public String getDateOfBirth() {
	  return dateOfBirth;
	 }

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPIN() {
		return PIN;
	}

	public void setPIN(String pIN) {
		PIN = pIN;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	}