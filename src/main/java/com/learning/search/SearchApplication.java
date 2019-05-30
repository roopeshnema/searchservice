package com.learning.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author test
 *
 */
@SpringBootApplication
public class SearchApplication implements ApplicationRunner {
	
	Logger loggerFactory = LoggerFactory.getLogger(SearchApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SearchApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		loggerFactory.info("Search Service Started Successfully");
		
	}
}