package com.User.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.User.demo.repository.UserRepository;

@SpringBootApplication
public class UserManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementAppApplication.class, args);
	}

}
