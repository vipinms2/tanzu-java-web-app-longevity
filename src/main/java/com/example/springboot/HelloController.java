package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1648000801!";
=======
		return "Greetings from Spring Boot + Tanzu + 1648000801!";
>>>>>>> d1648000801be1648000801d1648000801fc1648000801bc1648000801cda1648000801b1648000801f
	}

}
