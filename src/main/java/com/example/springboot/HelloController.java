package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1647576001!";
=======
		return "Greetings from Spring Boot + Tanzu + 1647576001!";
>>>>>>> 1647576001f1647576001c1647576001a1647576001c1647576001eda1647576001d1647576001ad1647576001dde1647576001d1647576001cdb
	}

}
