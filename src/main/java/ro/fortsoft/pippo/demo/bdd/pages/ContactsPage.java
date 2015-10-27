package ro.fortsoft.pippo.demo.bdd.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ro.fortsoft.pippo.demo.bdd.config.Locators;

/**
 * @author sbalamaci
 */
@DefaultUrl("http://localhost/contacts")
public class ContactsPage extends PageObject {

    public void clickOnAddContactLink() {
        WebElement lnkAdd = find(By.id(Locators.getValue("contacts.lnkAdd.id")));
        clickOn(lnkAdd);
    }

    public void fillContactInfo(String name, String phone, String address) {
        WebElement txtName = find(By.name(Locators.getValue("contacts.txtName.name")));
        WebElement txtPhone = find(By.name(Locators.getValue("contacts.txtPhone.name")));
        WebElement txtAddress = find(By.name(Locators.getValue("contacts.txtAddress.name")));

        typeInto(txtName, name);
        typeInto(txtPhone, phone);
        typeInto(txtAddress, address);
    }

    public void clickSubmit() {
        WebElement btnSubmit = find(By.id(Locators.getValue("contacts.btnSubmit.id")));
        clickOn(btnSubmit);
    }

    public String getContactsTableSource() {
        WebElement tblContacts = find(By.id(Locators.getValue("contacts.table.id")));
        return tblContacts.getText();
    }


}
