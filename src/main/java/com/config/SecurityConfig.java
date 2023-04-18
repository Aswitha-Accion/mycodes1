package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    @Autowired
    private CustomAuthenticationProvider customAuthenticationProvider;


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)throws Exception {
        //return http.csrf(csrf ->csrf.ignoringRequestMatchers(AntPathRequestMatcher.antMatcher("/h2-console/**")))               .authorizeRequests()
                //.requestMatchers("/users/**").hasRole("ADMIN")
                //.and()
                //.authorizeHttpRequests()
                //.requestMatchers(AntPathRequestMatcher.antMatcher("/h2-console/**"))
                //.permitAll()
        return http.authorizeHttpRequests(auth -> auth.requestMatchers(AntPathRequestMatcher.antMatcher("/h2-console/**")).permitAll())
                .headers(headers -> headers.frameOptions().disable())
                .csrf(csrf -> csrf.ignoringRequestMatchers(AntPathRequestMatcher.antMatcher("/h2-console/**")))
                //.and().headers().frameOptions().disable().and()
                //.authorizeHttpRequests()
                //.requestMatchers("/osc/**")
                //.authenticated().and()
                .httpBasic()
                .and()
                //.formLogin()
                //.and()
                .build();

    }
    //@Bean
     //   public InMemoryUserDetailsManager userDetailsManager() {
           // UserDetails user = User.withUsername("user")
                    //.password(passwordEncoder().encode("password1"))
                    //.roles("USER")
                   // .build();

            //UserDetails admin = User.withUsername("admin")
                    //.password(passwordEncoder().encode("admin"))
                    //.roles("USER", "ADMIN")
                    //.build();
            //return new InMemoryUserDetailsManager(user, admin);
        //}

        //@Bean
        //public PasswordEncoder passwordEncoder() {

            //return new BCryptPasswordEncoder();
       // }


}

