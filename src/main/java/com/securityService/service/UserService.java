package com.securityService.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.securityService.Entity.User;
import com.securityService.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	public static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
	
	public User addUser(User user) {
		LOGGER.info("In UserService.addUser()");
		user = userRepository.save(user);
		LOGGER.info("Out  UserService.addUser()");
		return user;
	}

}
