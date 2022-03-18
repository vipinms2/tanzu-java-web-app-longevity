package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1647590401!";
=======
		return "Greetings from Spring Boot + Tanzu + 1647590401!";
>>>>>>> 1647590401f1647590401c1647590401a1647590401c1647590401eda1647590401d1647590401ad1647590401dde1647590401d1647590401cdb
	}

}
