package ro.fortsoft.pippo.demo.bdd.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import ro.fortsoft.pippo.demo.bdd.serenity.ContactsSteps;

/**
 * @author sbalamaci
 */
public class ContactsStepDefs {

    @Steps
    private ContactsSteps contactsSteps;

    @Given("^(?:I try to access|I open) the 'Contacts' page$")
    public void navigateContactsPage() throws Exception {
        contactsSteps.openContactsPage();
    }

    @When("^I click on 'Add'$")
    public void clickOnAdd() throws Exception {
        contactsSteps.clickOnAdd();
    }

    @Then("^I click 'Submit' button$")
    public void clickSubmit() throws Exception {
        contactsSteps.clickOnSubmit();
    }

    @When("^I enter '(.*)' '(.*)' and '(.*)' in the Edit panel$")
    public void fillContactInfo(String name, String phone, String address) throws Exception {
        contactsSteps.fillContactInfo(name, phone, address);
    }

    @When("^I should see the 'Contacts' page$")
    public void isContactsPage() throws Exception {
        contactsSteps.isContactsPage();
    }


    @Then("^I should see '(.*)' in the list of contacts$")
    public void contactNameIsPresentInContactsPanel(String name) throws Exception {
        contactsSteps.isContactWithNamePresentInList(name);
    }

}
