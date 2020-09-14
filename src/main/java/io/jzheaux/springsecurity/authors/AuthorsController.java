package io.jzheaux.springsecurity.authors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorsController {
	@GetMapping("/")
	public String hello() {
		String name = "Authors";
		return String.format("Hello, %s!", name);
	}
}
