package com.azeem.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy // enables support for handling components marked with @Aspect annotation of AspectJ
@ComponentScan("com.azeem.aop")
public class DemoConfig {

}
