package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1648008001!";
=======
		return "Greetings from Spring Boot + Tanzu + 1648008001!";
>>>>>>> d1648008001be1648008001d1648008001fc1648008001bc1648008001cda1648008001b1648008001f
	}

}
