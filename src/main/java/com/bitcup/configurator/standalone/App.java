package com.bitcup.configurator.standalone;

import com.bitcup.configurator.FileConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User: omar
 */
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws Exception {

        FileConfig fileConfig = new FileConfig("app.properties", 5);

        while (true) {
            logger.info("app.value=" + fileConfig.getString("app.value", "UNKNOWN"));
            Thread.sleep(5000);
        }

    }
}
