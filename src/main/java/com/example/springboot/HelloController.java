package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1647583201!";
=======
		return "Greetings from Spring Boot + Tanzu + 1647583201!";
>>>>>>> 1647583201f1647583201c1647583201a1647583201c1647583201eda1647583201d1647583201ad1647583201dde1647583201d1647583201cdb
	}

}
