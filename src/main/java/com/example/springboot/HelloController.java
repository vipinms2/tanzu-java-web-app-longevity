package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1647554401!";
=======
		return "Greetings from Spring Boot + Tanzu + 1647554401!";
>>>>>>> 1647554401f1647554401c1647554401a1647554401c1647554401eda1647554401d1647554401ad1647554401dde1647554401d1647554401cdb
	}

}
