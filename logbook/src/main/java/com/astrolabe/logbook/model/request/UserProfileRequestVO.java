package com.astrolabe.logbook.model.request;

import java.io.Serializable;

public class UserProfileRequestVO implements Serializable{

	private static final long serialVersionUID = -8086988356324978027L;

	private String userId;
	
	private String pwd;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "UserProfileRequestVO [userId=" + userId + ", pwd=" + pwd + "]";
	}
	
	
}