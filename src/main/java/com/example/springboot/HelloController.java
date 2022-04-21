package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1650513603!";
=======
		return "Greetings from Spring Boot + Tanzu + 1650513603!";
>>>>>>> 1650513603e1650513603c1650513603d1650513603c1650513603f1650513603ed1650513603d1650513603b1650513603aab1650513603c
	}

}
