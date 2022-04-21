package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1650506401!";
=======
		return "Greetings from Spring Boot + Tanzu + 1650506401!";
>>>>>>> 1650506401e1650506401c1650506401d1650506401c1650506401f1650506401ed1650506401d1650506401b1650506401aab1650506401c
	}

}
