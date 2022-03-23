package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1648015201!";
=======
		return "Greetings from Spring Boot + Tanzu + 1648015201!";
>>>>>>> d1648015201be1648015201d1648015201fc1648015201bc1648015201cda1648015201b1648015201f
	}

}
