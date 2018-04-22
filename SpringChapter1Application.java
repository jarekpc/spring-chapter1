package com.example.springchapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class SpringChapter1Application {

	@RequestMapping("/")
	String home(){
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringChapter1Application.class, args);
	}
}
