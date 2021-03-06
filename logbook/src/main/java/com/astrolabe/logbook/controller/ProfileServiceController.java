package com.astrolabe.logbook.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.astrolabe.logbook.common.constant.URLConstants;
import com.astrolabe.logbook.common.exception.ServiceException;
import com.astrolabe.logbook.common.layout.ServiceRequest;
import com.astrolabe.logbook.common.layout.ServiceResponse;
import com.astrolabe.logbook.model.request.UserProfileRequestVO;
import com.astrolabe.logbook.services.ProfileService;

/**
 * Controller for User profile services
 * @author aneesh
 *
 */
@RestController
@RequestMapping(URLConstants.USER)
public class ProfileServiceController {

	private static final Logger logger = LoggerFactory.getLogger(ProfileServiceController.class);

	@Autowired
	ProfileService profileService;

	@ResponseBody
	@RequestMapping(value = URLConstants.VIEW, method = RequestMethod.POST)
	public <T>ServiceResponse<T> getUserProfile(@RequestBody ServiceRequest<UserProfileRequestVO> request) throws ServiceException {
		logger.info("View user request");
		UserProfileRequestVO userProfileRequest = (UserProfileRequestVO) request.getPayload();
		return profileService.getUserProfile(userProfileRequest);
	}

	
}
