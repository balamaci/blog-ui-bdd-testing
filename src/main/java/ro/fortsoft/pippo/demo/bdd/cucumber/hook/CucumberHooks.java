package ro.fortsoft.pippo.demo.bdd.cucumber.hook;

import cucumber.api.java.Before;
import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.pages.Pages;
import org.openqa.selenium.WebDriver;

/**
 * @author sbalamaci
 */
public class CucumberHooks {

    @ManagedPages
    private Pages pages;

    private WebDriver webDriver;

    @Before
    public void openBrowser() {
        System.out.println("Opening browser....");
//        Serenity.useFirefoxProfile(customFirefoxProfile());
        pages.getConfiguration().getEnvironmentVariables()
                .setProperty(ThucydidesSystemProperty.WEBDRIVER_BASE_URL.getPropertyName(), "http://localhost:8338");
        pages.getDriver().manage().deleteAllCookies();
        pages.getDriver().manage().window().maximize();
    }



}
