package com.jwt.service;

import java.util.ArrayList;

import com.jwt.entity.MyOAuthUser;
import com.jwt.service.MyOauthUser.MyOauthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private MyOauthUserService myOauthUserService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		MyOAuthUser myOAuthUser = myOauthUserService.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
		if (myOAuthUser != null) {
			return new User(myOAuthUser.getUsername(), myOAuthUser.getPassword(),
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}