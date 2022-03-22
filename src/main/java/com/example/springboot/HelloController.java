package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1647972001!";
=======
		return "Greetings from Spring Boot + Tanzu + 1647972001!";
>>>>>>> d1647972001be1647972001d1647972001fc1647972001bc1647972001cda1647972001b1647972001f
	}

}
