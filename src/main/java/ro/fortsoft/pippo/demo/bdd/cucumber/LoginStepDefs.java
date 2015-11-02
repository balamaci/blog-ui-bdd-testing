package ro.fortsoft.pippo.demo.bdd.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import ro.fortsoft.pippo.demo.bdd.serenity.ContactsSteps;
import ro.fortsoft.pippo.demo.bdd.serenity.LoginSteps;

/**
 * @author sbalamaci
 */
public class LoginStepDefs {

    @Steps
    private LoginSteps loginSteps;
    private ContactsSteps contactsSteps;


    @When("^I login with user '(.*)' and with password '(.*)'$")
    public void login_user(String username, String password) {
        loginSteps.enterUsernameAndPassword(username, password);
        loginSteps.clickOnSubmit();
    }

    @Then("^I see the 'Login' page$")
    public void login_page_is_shown() {
        loginSteps.isLoginPage();
    }

    @Then("^I should see a failed login warning message$")
    public void failed_login_warn_message_is_shown() {
        loginSteps.warnMessageWithKeyIsShown("login.warnLoginFailed");
    }


    @Given("^I am logged in as admin$")
    public void login_admin_user() {
        loginSteps.openLoginPage();
        loginSteps.enterUsernameAndPassword("admin", "admin");
        loginSteps.clickOnSubmit();
    }

}
