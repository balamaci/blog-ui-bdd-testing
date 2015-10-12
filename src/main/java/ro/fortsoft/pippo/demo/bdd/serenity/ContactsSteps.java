package ro.fortsoft.pippo.demo.bdd.serenity;

import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import ro.fortsoft.pippo.demo.bdd.pages.ContactsPage;

/**
 * @author sbalamaci
 */
public class ContactsSteps extends ScenarioSteps {

    @Page
    private ContactsPage contactsPage;

    public void openContacts() {

    }

}
