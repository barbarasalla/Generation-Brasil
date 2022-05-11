package com.generation.gamesStore.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.generation.gamesStore.model.UserModel;
import com.generation.gamesStore.repository.UserRepository;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;


	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		Optional<UserModel> user = userRepository.findByUser(userName);
	  
		user.orElseThrow(() -> new UsernameNotFoundException(userName + " not found."));


		return user.map(UserDetailsImpl::new).get();
	}
}
