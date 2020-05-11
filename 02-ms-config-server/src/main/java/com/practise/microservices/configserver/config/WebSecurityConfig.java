package com.practise.microservices.configserver.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        ///To enable bus refresh
        http.csrf().disable();

        http.authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .httpBasic();
    }
}
