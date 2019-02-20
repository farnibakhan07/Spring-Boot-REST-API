package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.example.demo"})
//@ComponentScan(basePackageClasses = "RestAPIController.java")
public class RestAPIApp {

	public static void main(String[] args) {
		SpringApplication.run(RestAPIApp.class, args);
	}

}

