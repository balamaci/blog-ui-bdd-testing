package ro.fortsoft.pippo.demo.bdd.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import ro.fortsoft.pippo.demo.bdd.pages.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author sbalamaci
 */
public class LoginSteps extends ScenarioSteps {

    @Page
    private LoginPage loginPage;

    @Step
    public void login(String username, String password) {
        loginPage.login(username, password);
    }

    @Step
    public void navigateLoginPage() {
        loginPage.open();
    }

    @Step
    public void isLoginPage() {
        assertThat(loginPage.getTitle()).startsWith("Login");
    }

    @Step
    public void failedLoginWarnMessageIsShown() {
        assertThat(loginPage.getDriver().getPageSource()).contains("Authentication failed");
    }



}
