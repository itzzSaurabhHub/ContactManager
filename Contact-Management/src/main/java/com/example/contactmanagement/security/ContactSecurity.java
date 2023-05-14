package com.example.contactmanagement.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebSecurity
@EnableWebMvc
public class ContactSecurity extends WebSecurityConfigurerAdapter{
	
	public static final String[] API_DOCUMENTATION_URLs = {
			
			"/v3/api-docs",
			"v2/api-docs",
			"/swagger-resources/**",
			"/swagger-ui/**",
			"/webjars/**",		
	};
	
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
		.antMatchers("/h2-console/**").hasRole("ADMIN")
		.antMatchers(HttpMethod.GET, "/contact/**").hasAnyRole("ADMIN","NORMAL")
		.antMatchers(HttpMethod.POST,"/contact/**").hasRole("ADMIN")
		.antMatchers(HttpMethod.PUT,"/contact/**").hasRole("ADMIN")
		.antMatchers(HttpMethod.DELETE,"/contact/**").hasRole("ADMIN")
		.antMatchers(API_DOCUMENTATION_URLs).permitAll()
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
