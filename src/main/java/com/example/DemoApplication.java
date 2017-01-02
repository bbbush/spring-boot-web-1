package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MarkerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        log.warn(MarkerFactory.getMarker("APP"), "hello, {} {}", "world", 8);
        configureApplication(new SpringApplicationBuilder())
            .run(args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder appBuilder) {
        log.warn(MarkerFactory.getMarker("APP"), "in servlet initializer");
        return configureApplication(appBuilder);
    }

    private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder appBuilder) {
        return appBuilder.sources(DemoApplication.class);
    }
}

