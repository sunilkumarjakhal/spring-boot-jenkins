package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Started");
	}
	
	@GetMapping("/get")
	public String getData() {
		return "Spring-Boot with Jenkins and Docker";
	}

	public static void main(String[] args) {
		logger.info("Excuted");
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

}
