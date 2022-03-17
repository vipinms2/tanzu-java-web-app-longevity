package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1647547201!";
=======
		return "Greetings from Spring Boot + Tanzu + 1647547201!";
>>>>>>> 1647547201f1647547201c1647547201a1647547201c1647547201eda1647547201d1647547201ad1647547201dde1647547201d1647547201cdb
	}

}
