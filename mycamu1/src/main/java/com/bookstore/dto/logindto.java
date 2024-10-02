package com.bookstore.dto;



public class logindto {
	private String username;  // Changed to lowercase 'u' to follow naming conventions
    
    private String password;

	public logindto() {
		super();
	}

	public logindto(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}