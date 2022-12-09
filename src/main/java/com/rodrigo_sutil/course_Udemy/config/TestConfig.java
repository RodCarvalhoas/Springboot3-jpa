package com.rodrigo_sutil.course_Udemy.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rodrigo_sutil.course_Udemy.entities.User;
import com.rodrigo_sutil.course_Udemy.repositories.UserRepository;

@Configuration
@Profile("test") 
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Rodrigo", "rodrigo@gmail.com", "81995511063", "123456");
		User u2 = new User(null, "Rafael", "rafael@gmail.com", "81995102523", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));	}
	
	
	
}
