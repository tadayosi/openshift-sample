package org.ouobpo.samples.openshift.domain;

import org.apache.log4j.Logger;

public class GreetingService {
    
    private static final Logger LOGGER = Logger.getLogger(GreetingService.class);
    
    public String hello(String name) {
        LOGGER.info("name = " + name);
        return String.format("Hello, %s!", name);
    }
    
}
