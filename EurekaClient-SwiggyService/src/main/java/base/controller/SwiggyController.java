package base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swiggy")
public class SwiggyController {

	@GetMapping("/")
	public String test(@RequestHeader("username") String username) {
		return "Welcome to swiggy : "+username;
	}

}