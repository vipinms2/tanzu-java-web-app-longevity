package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1647561601!";
=======
		return "Greetings from Spring Boot + Tanzu + 1647561601!";
>>>>>>> 1647561601f1647561601c1647561601a1647561601c1647561601eda1647561601d1647561601ad1647561601dde1647561601d1647561601cdb
	}

}
