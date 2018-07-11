package com.astrolabe.logbook.services;

import org.springframework.stereotype.Component;

import com.astrolabe.logbook.common.exception.ServiceException;
import com.astrolabe.logbook.common.layout.ServiceResponse;
import com.astrolabe.logbook.model.request.UserProfileRequestVO;

/**
 * @author aneesh
 *
 */
@Component
public interface ProfileService {

	public <T>ServiceResponse<T> getUserProfile(UserProfileRequestVO userProfileRequest) throws ServiceException;
}
