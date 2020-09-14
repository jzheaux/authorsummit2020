package io.jzheaux.springsecurity.authors;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorsController {
	@GetMapping("/")
	public String hello(Authentication authentication) {
		String name = authentication.getName();
		return String.format("Hello, %s!", name);
	}
}
