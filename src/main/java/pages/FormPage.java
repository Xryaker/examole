package pages;

import data.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage {
    @FindBy(id="firstName")
    WebElement firstName;
    @FindBy(id="lastName")
    WebElement lastName;
    @FindBy(id="userEmail")
    WebElement userEmail;

    public void fillForm(User user){
    firstName.sendKeys(user.getFirstName());
    lastName.sendKeys(user.getLastName());
    userEmail.sendKeys(user.getEmail());
    }
}
