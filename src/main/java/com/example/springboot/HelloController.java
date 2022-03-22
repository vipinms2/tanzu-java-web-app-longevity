package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1647979201!";
=======
		return "Greetings from Spring Boot + Tanzu + 1647979201!";
>>>>>>> d1647979201be1647979201d1647979201fc1647979201bc1647979201cda1647979201b1647979201f
	}

}
