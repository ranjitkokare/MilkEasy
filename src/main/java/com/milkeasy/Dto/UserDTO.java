package com.milkeasy.Dto;

public class UserDTO {
	
	private int userId;
	
	private String role;
	
	private String userName;
	
	private String mobile;
	
	private String email;
	
	private String address;
	
	private String upiid;
	
	private String password;
	
	private String confirmpassword;//9 fields

	public UserDTO(int userId, String role, String username, String mobile, String email, String address, String upiid,
			String password, String confirmpassword) {
		super();
		this.userId = userId;
		this.role = role;
		this.userName = username;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.upiid = upiid;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}

	public UserDTO() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		this.userName = username;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getUpiid() {
		return upiid;
	}

	public void setUpiid(String upiid) {
		this.upiid = upiid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", role=" + role + ", username=" + userName + ", mobile=" + mobile
				+ ", email=" + email + ", address=" + address + ", upiid=" + upiid + ", password=" + password
				+ ", confirmpassword=" + confirmpassword + "]";
	}
	
	
}
