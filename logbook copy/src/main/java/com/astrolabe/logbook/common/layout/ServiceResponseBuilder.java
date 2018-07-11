package com.astrolabe.logbook.common.layout;

import org.springframework.stereotype.Component;

import com.astrolabe.logbook.common.enums.Status;
import com.astrolabe.logbook.common.exception.ServiceException;

@Component
public class ServiceResponseBuilder implements IServiceResponseBuilder {

	@Override
	public <T>ServiceResponse<T> build(T vo) {
		ServiceResponse<T> response = new ServiceResponse<T>();
		response.setResponse(vo);
		response.setStatus(Status.SUCCESS);
		return response;
	}

	@Override
	public <T>ServiceResponse<T> buildError(ServiceException exception) {
		ServiceResponse<T> response = new ServiceResponse<T>();
		ErrorVO error = new ErrorVO();
		error.setCode(exception.getCode());
		if(exception.getMsg() != null){
			error.setMsg(exception.getMsg());
		}else {
			error.setMsg(exception.getMessage());
		}
		response.setError(error);
		response.setStatus(Status.ERROR);
		return response;
	}

	@Override
	public <T>ServiceResponse<T> buildFatal() {
		ServiceResponse<T> response = new ServiceResponse<T>();
		ErrorVO error = new ErrorVO();
		error.setCode("FATAL");
		error.setMsg("Fatal Error occurred while executing the service.");
		response.setError(error);
		response.setStatus(Status.FATAL);
		return response;
	}

}