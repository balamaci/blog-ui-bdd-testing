package ro.fortsoft.pippo.demo.bdd.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import ro.fortsoft.pippo.demo.bdd.config.Locators;

/**
 * @author sbalamaci
 */
public class LoginPage extends PageObject {

    public void login(String username, String password) {
        typeInto(getDriver().findElement(By.id(Locators.getValue("login.usename"))), username);
    }

}
