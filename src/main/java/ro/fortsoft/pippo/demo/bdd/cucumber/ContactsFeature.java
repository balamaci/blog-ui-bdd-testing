package ro.fortsoft.pippo.demo.bdd.cucumber;

import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import ro.fortsoft.pippo.demo.bdd.pages.ContactsPage;

/**
 * @author sbalamaci
 */
public class ContactsFeature extends ScenarioSteps {

    @Page
    private ContactsPage contactsPage;


}
