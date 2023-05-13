package com.example.contactmanagement.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class ContactSecurity extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
		.antMatchers("/h2-console/**").hasRole("ADMIN")
		.antMatchers("/contact/**").hasAnyRole("ADMIN","NORMAL")
		.anyRequest().authenticated()
		.and()
		.httpBasic()
		.and()
		.csrf()
		.disable()
		.headers()
		.frameOptions()
		.disable();
	}
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication()
		.withUser("ADMIN")
		.password("{noop}itzAdmin")
		.roles("ADMIN")
		.and()
		.withUser("User")
		.password("{noop}itzUser")
		.roles("NORMAL");
		
	}

}
