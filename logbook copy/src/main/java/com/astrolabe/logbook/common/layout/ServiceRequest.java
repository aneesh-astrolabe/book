package com.astrolabe.logbook.common.layout;

import java.io.Serializable;

public class ServiceRequest<T> implements Serializable{

	private static final long serialVersionUID = 2475583464864602602L;
	private T payload;

	public T getPayload() {
		return payload;
	}

	public void setPayload(T payload) {
		this.payload = payload;
	}
	

}
