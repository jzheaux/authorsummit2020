package io.jzheaux.springsecurity.authors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails josh = User.withUsername("josh")
				.password("{bcrypt}$2a$10$1/JJ4w5QOt4ln9ris9ERneYh1tXCuKedk/fjStcJlWGZvTDAha5AG")
				.roles("USER")
				.build();
		UserDetails ria = User.withUsername("ria")
				.password("{bcrypt}$2a$10$1/JJ4w5QOt4ln9ris9ERneYh1tXCuKedk/fjStcJlWGZvTDAha5AG")
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(josh, ria);
	}
}
