package org.ouobpo.samples.openshift.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.ouobpo.samples.openshift.domain.GreetingService;

@Path("/hello")
public class Hello {
    
    @Inject
    private GreetingService service;
    
    @GET
    @Path("/json/{name}")
    @Produces({ "application/json" })
    public String json(@PathParam("name") String name) {
        return String.format("{\"result\":\"%s\"}", service.hello(name));
    }
    
    @GET
    @Path("/xml/{name}")
    @Produces({ "application/xml" })
    public String xml(@PathParam("name") String name) {
        return String.format("<xml><result>%s</result></xml>", service.hello(name));
    }
    
}