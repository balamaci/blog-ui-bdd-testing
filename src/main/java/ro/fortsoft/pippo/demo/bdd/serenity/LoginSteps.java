package ro.fortsoft.pippo.demo.bdd.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import ro.fortsoft.pippo.demo.bdd.config.Messages;
import ro.fortsoft.pippo.demo.bdd.pages.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author sbalamaci
 */
public class LoginSteps extends ScenarioSteps {

    private LoginPage loginPage;

    @Step
    public void enterUsernameAndPassword(String username, String password) {
        loginPage.enterUsernameAndPassword(username, password);
    }

    @Step
    public void clickOnSubmit() {
        loginPage.clickOnSubmit();
    }

    @Step
    public void openLoginPage() {
        loginPage.open();
    }

    @Step
    public void isLoginPage() {
        assertThat(loginPage.getTitle()).startsWith("Login");
    }

    @Step
    public void warnMessageWithKeyIsShown(String key) {
        assertThat(loginPage.getDriver().getPageSource()).contains(Messages.getValue(key));
    }

}