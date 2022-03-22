package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1647979202!";
=======
		return "Greetings from Spring Boot + Tanzu + 1647979202!";
>>>>>>> d1647979202be1647979202d1647979202fc1647979202bc1647979202cda1647979202b1647979202f
	}

}
