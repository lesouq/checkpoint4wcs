package com.wcs.wildcircus.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http
	    	.authorizeRequests()
	        .antMatchers("/login/**").permitAll()
	        .antMatchers("/admin/**").hasAnyRole("ADMIN","USER")
	            .and()
	        .formLogin()
	        .loginPage("/login1.html")
	        .defaultSuccessUrl("/admin", true)
	            .and()
	        .logout()
	        .logoutSuccessUrl("/")
	        .logoutUrl("/logout")
	        	.and()
	        .httpBasic();
    }
		
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
		auth.inMemoryAuthentication()
	    .withUser("admin")
	        .password(encoder.encode("1234"))
	        .roles("ADMIN")
	        .and()
	    .withUser("user")
	        .password(encoder.encode("123"))
	        .roles("USER");
	}
}	
