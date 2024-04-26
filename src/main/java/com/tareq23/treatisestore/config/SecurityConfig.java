package com.tareq23.treatisestore.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.net.http.HttpRequest;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http.authorizeHttpRequests(request -> request.anyRequest()
//                        .authenticated())
//                .httpBasic(withDefaults())
//                .build();

        return http.authorizeHttpRequests(
                authorizeRequests -> authorizeRequests.requestMatchers("/admin/**").hasRole("ADMIN")
                        .requestMatchers("/**").permitAll()
        ).formLogin(form -> form.loginPage("/auth/login").permitAll()).build();
    }


    @Bean
    PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }

}
