package com.techmentro;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter
{
/*
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.requestMatcher(EndpointRequest.toAnyEndpoint()).authorizeRequests()
		.anyRequest().permitAll();
				
	}*/

}
