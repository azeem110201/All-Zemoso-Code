package com.azeem.springsecurity.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
    // AbstractSecurityWebApplicationInitializer:
    //      Registers the DelegatingFilterProxy to use the springSecurityFilterChain before any other registered Filter .
    //      Spring Security maintains a filter chain internally where each of the filters has a particular responsibility and filters are added or removed from the configuration depending on which services are required
}
