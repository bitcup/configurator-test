package com.bitcup.configurator.servlet;

import com.bitcup.configurator.FileConfigMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * User: omar
 */
public class ConfigExposingServletContextListener implements ServletContextListener {

    private static final Logger logger = LoggerFactory.getLogger(ConfigExposingServletContextListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Put a copy of the config into the application scope.
        logger.info("putting copy of the config into the application scope...");
        final ServletContext servletContext = sce.getServletContext();
        FileConfigMap config = new FileConfigMap("app.properties");
        servletContext.setAttribute("config", config.getMap());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // do nothing
    }
}
