package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1647993601!";
=======
		return "Greetings from Spring Boot + Tanzu + 1647993601!";
>>>>>>> d1647993601be1647993601d1647993601fc1647993601bc1647993601cda1647993601b1647993601f
	}

}
