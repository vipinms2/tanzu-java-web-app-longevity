package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1650499205!";
=======
		return "Greetings from Spring Boot + Tanzu + 1650499205!";
>>>>>>> 1650499205e1650499205c1650499205d1650499205c1650499205f1650499205ed1650499205d1650499205b1650499205aab1650499205c
	}

}
