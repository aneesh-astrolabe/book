package com.astrolabe.logbook.common.layout;

import com.astrolabe.logbook.common.exception.ServiceException;

public interface IServiceResponseBuilder {

	public <T>ServiceResponse<T> build(T response);
	public <T>ServiceResponse<T> buildError(ServiceException exception);
	public <T>ServiceResponse<T> buildFatal();
	
}
