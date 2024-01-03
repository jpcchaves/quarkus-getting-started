package org.acme.controllers;

import org.acme.service.GreetingService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    private GreetingService greetingService;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return greetingService.greeting();
    }
}
