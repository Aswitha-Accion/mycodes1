package com.config;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public class SecurityConfiguration implements webSecurityConfigAdapter {

    protected void configure(HttpSecurity httpSecurity)throws Exception{
        httpSecurity.authorizeHttpRequests().dispatcherTypeMatchers(HttpMethod.valueOf(" / ")).permitAll().and()
                .authorizeRequests().dispatcherTypeMatchers(HttpMethod.valueOf("/console/**")).permitAll();
        httpSecurity.csrf().disable();
        httpSecurity.headers().frameOptions().disable();
        
    }
}
