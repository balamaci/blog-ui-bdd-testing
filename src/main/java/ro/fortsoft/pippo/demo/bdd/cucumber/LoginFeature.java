package ro.fortsoft.pippo.demo.bdd.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import ro.fortsoft.pippo.demo.bdd.serenity.LoginSteps;

/**
 * @author sbalamaci
 */
public class LoginFeature {

    @Steps
    private LoginSteps loginSteps;

    @Given("^I open the application$")
    public void openApplication() throws Exception {
        loginSteps.getDriver().navigate();
    }

    @Then("^I should see the Login page$")
    public void loginPageIsShown() throws Exception {
        System.out.println("Tadaaaaaaaa *****");
        loginSteps.isLoginPage();
    }


}
