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
    public void navigate_contacts_page() throws Exception {
        contactsSteps.openContactsPage();
    }

    @When("^I click on 'Add'$")
    public void click_on_add() throws Exception {
        contactsSteps.clickOnAdd();
    }

    @Then("^I click 'Submit' button$")
    public void click_submit() throws Exception {
        contactsSteps.clickOnSubmit();
    }

    @When("^I enter '(.*)' '(.*)' and '(.*)' in the Edit panel$")
    public void fill_contact_info(String name, String phone, String address) throws Exception {
        contactsSteps.fillContactInfo(name, phone, address);
    }

    @When("^I should see the 'Contacts' page$")
    public void is_contacts_page() throws Exception {
        contactsSteps.isContactsPage();
    }


    @Then("^I should see '(.*)' in the list of contacts$")
    public void contact_name_is_present_in_contacts_table(String name) throws Exception {
        contactsSteps.isContactWithNamePresentInList(name);
    }

}
