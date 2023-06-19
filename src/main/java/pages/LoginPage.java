package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id = "userName")
    WebElement login;
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement pass;
    @FindBy(id = "login")
    WebElement logInButton;
    @FindBy(xpath = "//p[@id=\"name\"]")
    WebElement error;

    public void logIN(String login,String pass){
        this.login.sendKeys(login);
        this.pass.sendKeys(pass);
        logInButton.click();
    }


    public Boolean checkPASS() {
        try {
            System.out.println(error.getText());
        }catch (Exception e){
            return true;
        }
        return false;
    }
}
