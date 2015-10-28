package ro.fortsoft.pippo.demo.bdd.cucumber;

import cucumber.api.java.en.And;
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
    public void login(String username, String password) throws Exception {
        loginSteps.login(username, password);
    }

    @And("^I see the 'Login' page$")
    public void loginPageIsShown() throws Exception {
        loginSteps.isLoginPage();
    }

    @Then("^I should see a failed login warning message$")
    public void failedLoginWarnMessageIsShown() {
        loginSteps.failedLoginWarnMessageIsShown();
    }


    @Given("^I am logged in$")
    public void loginAdminUser() {
        loginSteps.openLoginPage();
        loginSteps.login("admin", "admin");
    }

}
