package com.astrolabe.logbook.common.exception;

public class ServiceException extends Throwable{

	private static final long serialVersionUID = -6525828466204796094L;
	
	public ServiceException(String code, String msg) {
		this.code=code;
		this.msg=msg;
	}
	
	public ServiceException(Throwable e) {
		this.code="RTE";
		this.msg=e.getMessage();
	}
	
	private String code;
	
	private String msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
