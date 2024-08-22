package com.securityService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.securityService.Entity.User;
import com.securityService.Repository.UserRepository;

@Component
public class UserInfoUserDetailsService implements UserDetailsService {
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findByuserName(username);	
		return user.map(UserInfoUserDetails :: new).orElseThrow(()-> new UsernameNotFoundException("user not found"+username));
	}

}
