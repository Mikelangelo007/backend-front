package com.weather.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.weather.info.model.User;
import com.weather.info.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@GetMapping("users")
	public List<User> getUsers(){
		return this.userRepository.findAll();
	}
}
