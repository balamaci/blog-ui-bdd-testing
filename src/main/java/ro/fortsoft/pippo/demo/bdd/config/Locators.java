package ro.fortsoft.pippo.demo.bdd.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * @author sbalamaci
 */
public class Locators {

    private static final Locators locators = new Locators();

    private static Config locatorsConfig = ConfigFactory.load("locators");

    public Locators() {
    }

/*
    public static Locators get() {
        return locators;
    }
*/

    public static String getValue(String key) {
        return locatorsConfig.getString(key);
    }


}
