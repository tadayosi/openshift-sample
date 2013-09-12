package org.ouobpo.samples.openshift.domain;

public class GreetingService {
    
    public String hello(String name) {
        return String.format("Hello, %s!", name);
    }
    
}
