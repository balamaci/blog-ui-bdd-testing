package ro.fortsoft.pippo.demo.bdd.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @author sbalamaci
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        format = { "pretty", "html:target/pippo", "json:target/cucumber.json" },
        features = {"src/main/resources/features/"},
        glue = "ro.fortsoft.pippo.demo.bdd.cucumber")
public class PippoCrudDemoRunner {



}
