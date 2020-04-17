package com.mendes.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mendes.curso.entities.User;
import com.mendes.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "thiago", "teste1", "thiago@gmail.com", "78778878");
		User u2 = new User(null, "ana", "ana1", "ana@gmail.com", "78778879");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
