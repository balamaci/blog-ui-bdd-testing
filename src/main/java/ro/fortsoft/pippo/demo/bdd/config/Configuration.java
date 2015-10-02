package ro.fortsoft.pippo.demo.bdd.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * @author sbalamaci
 */
public class Configuration {

    private static final Configuration instance = new Configuration();

    private Config locators = ConfigFactory.load("locators");

}
