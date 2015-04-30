/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytesoft.sicec.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Configuration class, spring security.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    public SecurityConfiguration() { }

    @Autowired
    public void configureGlobal(final AuthenticationManagerBuilder auth) 
            throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("123456")
                .roles("USER");
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("123456")
                .roles("ADMIN");
    }

    @Override
    protected void configure(final HttpSecurity http) throws Exception {

        http.csrf().disable()
            .authorizeRequests()
                .antMatchers("/admin/*")
                    .access("hasRole('ROLE_ADMIN')")
                .antMatchers("/common/*")
                    .access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
            .and()
                .formLogin()
                    .loginProcessingUrl("/j_spring_security_check")
                    .loginPage("/login.html")
                    .defaultSuccessUrl("/common/home.html")
                    .failureUrl("/login.html?error")
                    .permitAll()
            .and()
                .logout()
                    .logoutSuccessUrl("/login.html?logout");

    }

}
