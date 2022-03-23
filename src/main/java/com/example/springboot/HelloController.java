package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1648022401!";
=======
		return "Greetings from Spring Boot + Tanzu + 1648022401!";
>>>>>>> d1648022401be1648022401d1648022401fc1648022401bc1648022401cda1648022401b1648022401f
	}

}
