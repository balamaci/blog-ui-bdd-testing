package ro.fortsoft.pippo.demo.bdd.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import ro.fortsoft.pippo.demo.bdd.config.Locators;

/**
 * @author sbalamaci
 */
//@DefaultUrl("http://tomcat:8080/pippo/login")
public class LoginPage extends PageObject {

    public void login(String username, String password) {
        WebElement txtUsername = getDriver()
                .findElement(By.name(Locators.getValue("login.txtUsername.name")));
        WebElement txtPassword = getDriver()
                .findElement(By.name(Locators.getValue("login.txtPassword.name")));

        typeInto(txtUsername, username);
        typeInto(txtPassword, password);

        WebElement btnSubmit = getDriver()
                .findElement(By.name(Locators.getValue("btnSubmit.name")));

        clickOn(btnSubmit);
    }

}
