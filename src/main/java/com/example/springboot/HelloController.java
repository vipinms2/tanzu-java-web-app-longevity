package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
<<<<<<< HEAD
		return "Greetings from Spring Boot + Tanzu + 1647568801!";
=======
		return "Greetings from Spring Boot + Tanzu + 1647568801!";
>>>>>>> 1647568801f1647568801c1647568801a1647568801c1647568801eda1647568801d1647568801ad1647568801dde1647568801d1647568801cdb
	}

}
