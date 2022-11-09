package com.naru.ex1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ex1Application {

	@Value("${global.guestId}")
	private String guestId;
	@Value("${global.siteName}")
	private String siteName;

	public static void main(String[] args) {
		SpringApplication.run(Ex1Application.class, args);
	}

	@GetMapping("/")
	public String mainTest() {
		return "Naru Cheer up!!";
	}

	@GetMapping("/global")
	public String propertiesTest() {

		return guestId + ' ' + siteName;
	}

}
