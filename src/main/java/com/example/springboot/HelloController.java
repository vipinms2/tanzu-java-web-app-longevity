package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1650492001!";
=======
		return "Greetings from Spring Boot + Tanzu + 1650492001!";
>>>>>>> 1650492001e1650492001c1650492001d1650492001c1650492001f1650492001ed1650492001d1650492001b1650492001aab1650492001c
	}

}
