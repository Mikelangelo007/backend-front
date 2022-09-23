package com.weather.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.weather.info.model.User;
import com.weather.info.repository.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.*;
@SpringBootApplication
public class InfoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(InfoApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Elchin","Huseynov","elchinhuseynov33@gmail.com"));
		this.userRepository.save(new User("Elchin","Huseynov","elchinhuseynov007@gmail.com"));
		this.userRepository.save(new User("Elchin","Huseynov","elchinhuseynov60@gmail.com"));
	}

}
