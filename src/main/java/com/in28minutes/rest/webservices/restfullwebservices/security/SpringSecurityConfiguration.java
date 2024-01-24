package com.in28minutes.rest.webservices.restfullwebservices.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringSecurityConfiguration {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequest(
				auth -> auth.anyRequest().authenticated()
				);
		
		http.httpBasic(withDefaults());
		
		http.csrf.disable();
		
		
		
		return http.build();
	
	}

}
