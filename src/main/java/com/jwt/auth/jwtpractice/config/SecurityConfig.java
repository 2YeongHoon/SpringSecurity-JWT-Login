package com.jwt.auth.jwtpractice.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    public void configure(WebSecurity web{
//        web
//                .ignoring()
//                .antMatchers(
//                )
//    })

    @Override
    protected void configure (HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests()
                .antMatchers("/api/hello").permitAll()
                .anyRequest().authenticated();
    }
}
