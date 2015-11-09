package com.gologo13;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/")
	public String index() {
		return "this is Spring Boot Sample!";
	}

}
