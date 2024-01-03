package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingServiceImpl implements GreetingService {

    public String greeting() {
        return "Hello World!";
    }
}   
