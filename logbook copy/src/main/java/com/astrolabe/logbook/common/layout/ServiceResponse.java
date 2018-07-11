package com.astrolabe.logbook.common.layout;

import com.astrolabe.logbook.common.enums.Status;

public class ServiceResponse<T> {

	private T response;
	
	private Status status;
	
	private ErrorVO error;
	
	public T getResponse() {
		return response;
	}
	
	public void setResponse(T response) {
		this.response = response;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public ErrorVO getError() {
		return error;
	}

	public void setError(ErrorVO error) {
		this.error = error;
	}
	
}
