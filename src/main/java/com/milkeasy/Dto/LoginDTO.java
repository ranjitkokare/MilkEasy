package com.milkeasy.Dto;

public class LoginDTO {
	
	private String role;
	private String email;
	private String password;
	
	//roll based
	public LoginDTO(String role, String email, String password) {
		super();
		this.role = role;
		this.email = email;
		this.password = password;
	}
	
	
	public LoginDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "LoginDTO [role=" + role + ", email=" + email + ", password=" + password + "]";
	}
	
}
