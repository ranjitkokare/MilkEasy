package com.milkeasy.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity	//orm mapping
@Table(name = "user")
public class User {
	
	@Id	//for primary key
	@Column(name="user_id", length=45)
	@GeneratedValue(strategy = GenerationType.AUTO)//auto generate the id when record is inserted
	private int userId;
	
	@Column(name="role", length=255)
	private String role;
	
	@Column(name="user_name", length=255)
	private String userName;
	
	@Column(name="mobile", length=255)
	private String mobile;
	
	@Column(name="email", length=255)
	private String email;
	
	@Column(name="address", length=255)
	private String address;
	
	@Column(name="upiid", length=255)
	private String upiid;
	
	@Column(name="password", length=255)
	private String password;
	
	@Column(name="confirmpassword", length=255)
	private String confirmpassword;
	
	
	public User(int userId, String role, String username, String mobile, String email, String address,
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

	public User(int userId, String username, String email, String password) {
		super();
		this.userId = userId;
		this.role = null;
		this.userName = username;
		this.mobile = null;
		this.email = email;
		this.address = null;
		this.upiid = null;
		this.password = password;
		this.confirmpassword = null;
	}

	public User() {
		super();
	}

	//changes to be made
//	public User(int userId2, String userName2, String email2, String encode) {
//		
//	}


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


	public String getUsername() {
		return userName;
	}


	public void setUsername(String username) {
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
		return "User [userId=" + userId + ", role=" + role + ", username=" + userName + ", mobile=" + mobile
				+ ", email=" + email + ", address=" + address + ", upiid=" + upiid + ", password=" + password
				+ ", confirmpassword=" + confirmpassword + "]";
	}
	
	
}
