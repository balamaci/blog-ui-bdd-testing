package ro.fortsoft.pippo.demo.bdd.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import ro.fortsoft.pippo.demo.bdd.pages.LoginPage;

/**
 * @author sbalamaci
 */
public class LoginSteps extends ScenarioSteps {

    @Page
    private LoginPage loginPage;

    @Step
    public void login() {
        loginPage.login("admin", "admin");
    }
}
