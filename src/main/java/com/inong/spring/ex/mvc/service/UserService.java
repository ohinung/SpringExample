package com.inong.spring.ex.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inong.spring.ex.mvc.repository.UserRepository;

@Service

public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public int addUser(
			String name
			,String yyyymmdd
			,String email
			,String introduce) {
		int count = userRepository.insertUser();
		return count;
	}

}
