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
                .setProperty(ThucydidesSystemProperty.WEBDRIVER_BASE_URL.getPropertyName(),
                        "http://tomcat:8080/pippo/");
/*
        pages.getConfiguration().getEnvironmentVariables()
                .setProperty(ThucydidesSystemProperty.WEBDRIVER_REMOTE_URL.getPropertyName(),
                        "http://tomcat:8080/pippo");
*/


        pages.getDriver().manage().deleteAllCookies();
        pages.getDriver().manage().window().maximize();
    }



}
