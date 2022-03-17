package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1647532802!";
=======
		return "Greetings from Spring Boot + Tanzu + 1647532802!";
>>>>>>> 1647532802f1647532802c1647532802a1647532802c1647532802eda1647532802d1647532802ad1647532802dde1647532802d1647532802cdb
	}

}
