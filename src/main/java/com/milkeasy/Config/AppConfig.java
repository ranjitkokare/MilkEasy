package com.milkeasy.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.milkeasy.Service.UserService;
import com.milkeasy.Service.impl.UserIMPL;


@Configuration
public class AppConfig {
	@Bean
	public UserService userService() {
		return new UserIMPL(); // Or however you create your AdminService instance
	}
}
