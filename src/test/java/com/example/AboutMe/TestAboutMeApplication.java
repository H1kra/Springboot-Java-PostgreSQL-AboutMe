package com.example.AboutMe;

import org.springframework.boot.SpringApplication;

public class TestAboutMeApplication {

	public static void main(String[] args) {
		SpringApplication.from(AboutMeApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
