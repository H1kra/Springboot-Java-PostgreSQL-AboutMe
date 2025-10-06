package com.example.AboutMe.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
    public class userController {
        @GetMapping("/alive")
        public String alive() {
            return "alive";
        }
        @GetMapping("/users")
        public String users() {
            return "users";
        }
}
