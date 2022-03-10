package com.azeem.restapi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.azeem.restapi")

// The @EnableWebMvc annotation is used for enabling Spring MVC in an application and works by importing
// the Spring MVC Configuration from WebMvcConfigurationSupport.
// The XML equivalent with similar functionality is <mvc:annotation-driven/>

// WebMvcConfigurer: Defines callback methods to customize the Java-based configuration for Spring MVC enabled via @EnableWebMvc
public class DemoConfig implements WebMvcConfigurer {
}
