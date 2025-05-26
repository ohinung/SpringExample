package com.inong.spring.ex.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inong.spring.ex.mvc.domain.User;
import com.inong.spring.ex.mvc.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/mvc/user/create")
	public String createUser(
			@RequestParam("name") String name
			,@RequestParam("birthday")String yyyymmdd
			,@RequestParam("email")String email
			,@RequestParam("introduce")String introduce) {
		
		User user = new User();
		user.setName(name);
		user.setName(birthday);
		user.setName(name);
		user.setName(name);
		int count = userService.addUser(name, yyyymmdd, email, introduce);
		
		return "redirect:/mvc/user/info";
	}
}
