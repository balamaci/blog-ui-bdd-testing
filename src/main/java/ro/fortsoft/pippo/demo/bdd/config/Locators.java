package ro.fortsoft.pippo.demo.bdd.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * @author sbalamaci
 */
public class Locators {

    private static Config locatorsConfig = ConfigFactory.load("locators");

    private Locators() {
    }

    public static String getValue(String key) {
        return locatorsConfig.getString(key);
    }

}
