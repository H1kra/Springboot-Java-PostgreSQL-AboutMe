package com.example.AboutMe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.AboutMe.controller.userController;


@SpringBootApplication
@RestController
public class AboutMeApplication {
	public static void main(String[] args) {
		SpringApplication.run(AboutMeApplication.class, args);
	}

	@GetMapping("/alive")
	public String alive() {
		return "alive";
	}
	@GetMapping("/user")
	public String user() {
		//userController()
		return "user";
	}

}
