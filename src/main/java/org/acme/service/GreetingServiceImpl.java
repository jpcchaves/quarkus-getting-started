package org.acme.service;

import java.util.List;
import java.util.stream.Collectors;

import org.acme.domain.entities.Greeting;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class GreetingServiceImpl implements GreetingService {


    public String greeting() {
        return "Hello World!";
    }

    @Transactional
    public String greetingName(String name) {
        Greeting greeting = new Greeting();

        greeting.name = name;
        greeting.persist();

        return "Hello, " + name + " " + greeting.id + "!";
    }

    
    public String greetingNames() {
        List<Greeting> greetings = Greeting.listAll();
        String names = greetings.stream().map(g -> g.name).collect(Collectors.joining(", "));

        return "I've said hello  to " + names;
    }
}   
