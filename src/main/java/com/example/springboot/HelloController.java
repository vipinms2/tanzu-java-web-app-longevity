package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1647540001!";
=======
		return "Greetings from Spring Boot + Tanzu + 1647540001!";
>>>>>>> 1647540001f1647540001c1647540001a1647540001c1647540001eda1647540001d1647540001ad1647540001dde1647540001d1647540001cdb
	}

}
