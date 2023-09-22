package com.onesuite.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@ComponentScans({ @ComponentScan("com.onesuite.usermanagement.controller") })
@EnableJpaRepositories("com.onesuite.usermanagement.repository")
@EntityScan("com.onesuite.usermanagement.model")

public class UserManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);
		System.out.println("UserManagement service started...!!!");
	}

}
