package com.mitrais.rms.model;

public class User {
	private Long id;
	private String userName;
	private String password;
	private String name;
	private String gender;
	private String email;
	private String address;

	public User(Long id, String userName, String password, String name, String gender,
			String email, String address) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
	
}
