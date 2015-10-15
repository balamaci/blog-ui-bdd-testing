package ro.fortsoft.pippo.demo.bdd.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import ro.fortsoft.pippo.demo.bdd.serenity.ContactsSteps;

/**
 * @author sbalamaci
 */
public class ContactsFeature extends ScenarioSteps {

    @Steps
    private ContactsSteps contactsSteps;

    @Given("^I try to access the 'Contacts' page$")
    public void navigateContactsPage() throws Exception {
        contactsSteps.openContactsPage();
    }

    @Given("^I open the 'Contacts' page$")
    public void openContactsPage() throws Exception {
        contactsSteps.openContactsPage();
    }

    @When("^I click on 'Add'$")
    public void clickOnAdd() throws Exception {
        contactsSteps.addContact();
    }

    @Then("^I should see the 'Contacts' page$")
    public void isContactsPage() throws Exception {
        contactsSteps.isContactsPage();
    }


}
