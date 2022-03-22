package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1647986401!";
=======
		return "Greetings from Spring Boot + Tanzu + 1647986401!";
>>>>>>> d1647986401be1647986401d1647986401fc1647986401bc1647986401cda1647986401b1647986401f
	}

}
