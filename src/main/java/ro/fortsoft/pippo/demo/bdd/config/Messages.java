package ro.fortsoft.pippo.demo.bdd.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * @author Serban Balamaci
 */
public class Messages {

    private static Config messagesConfig = ConfigFactory.load("messages");

    private Messages() {
    }

    public static String getValue(String key) {
        return messagesConfig.getString(key);
    }
}
