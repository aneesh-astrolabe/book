package com.astrolabe.logbook.model.response;

import java.io.Serializable;

public class UserProfileResponseVO implements Serializable{

	private static final long serialVersionUID = 8993939351237038241L;

	private String userId;
	
	private String userName;
	
	private String email;
	
	private String contactNumber;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "UserProfileResponseVO [userId=" + userId + ", userName=" + userName + ", email=" + email
				+ ", contactNumber=" + contactNumber + "]";
	}
	
	
}
