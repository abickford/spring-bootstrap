package com.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/world")
	public String getHelloWorld() {
		return "helloworld";
	}
	
}
