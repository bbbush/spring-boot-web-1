package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MarkerFactory;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

// implements WebApplicationInitializer does not work
public class Initializer implements ServletContextInitializer{

    private static final Logger log = LoggerFactory.getLogger(Initializer.class);

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        log.warn(MarkerFactory.getMarker("APP"), "in webapp initializer");
    }
}
