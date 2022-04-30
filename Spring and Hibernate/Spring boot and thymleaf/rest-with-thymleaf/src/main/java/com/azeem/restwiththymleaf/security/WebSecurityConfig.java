package com.azeem.restwiththymleaf.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .passwordEncoder(new BCryptPasswordEncoder())
                .withUser("azeem")
                .password("$2a$10$HIEGyzrp69r63kuKJIlKvu9D7y5IEHneTMgTae3zDqF1lwEtimE4S")
                .roles("ADMIN")
                .and()
                .withUser("john")
                .password("$2a$10$HIEGyzrp69r63kuKJIlKvu9D7y5IEHneTMgTae3zDqF1lwEtimE4S")
                .roles("USER")
        ;

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/api/employees/list/*", "/api/employees/showFormForAdd/*").hasAnyRole("USER", "ADMIN")
                .antMatchers("/api/employees/showFormForUpdate/*", "/api/employees/delete/*").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginProcessingUrl("/authenticateTheUser")
                .permitAll()
                .and()
                .logout()  // logout of the session
                .permitAll()
                .and()
                .exceptionHandling()
                .accessDeniedPage("/access-denied");
    }
}
