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


    @When("^I enter user '(.*)' with password '(.*)'$")
    public void login_user(String username, String password) throws Exception {
        loginSteps.submitUsernameAndPassword(username, password);
    }

    @Then("^I see the 'Login' page$")
    public void login_page_is_shown() throws Exception {
        loginSteps.isLoginPage();
    }

    @Then("^I should see a failed login warning message$")
    public void failed_login_warn_message_is_shown() {
        loginSteps.warnMessageWithKeyIsShown("login.warnLoginFailed");
    }


    @Given("^I am logged in as admin$")
    public void login_admin_user() {
        loginSteps.openLoginPage();
        loginSteps.submitUsernameAndPassword("admin", "admin");
    }

}
