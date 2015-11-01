package ro.fortsoft.pippo.demo.bdd.serenity;

import net.thucydides.core.steps.ScenarioSteps;
import ro.fortsoft.pippo.demo.bdd.pages.ContactsPage;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author sbalamaci
 */
public class ContactsSteps extends ScenarioSteps {

    private ContactsPage contactsPage;

    public void openContactsPage() {
        contactsPage.open();
    }

    public void isContactsPage() {
        assertThat(getDriver().getTitle()).startsWith("Contacts");
    }

    public void clickOnAdd() {
        contactsPage.clickOnAddContactLink();
    }

    public void fillContactInfo(String name, String phone, String address) {
        contactsPage.fillContactInfo(name, phone, address);
    }

    public void clickOnSubmit() {
        contactsPage.clickSubmit();
    }

    public void isContactWithNamePresentInList(String name) {
        assertThat(contactsPage.getContactsTableSource()).contains(name);
    }

}
