package steps;

import configuration.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

public class LoginSteps extends BaseClass {
    static {
        if (driver == null) {
            BaseClass.create();
        }
    }
    LoginPage loginPage= PageFactory.initElements(driver,LoginPage.class);
    @When("I send log {string} and pass{string}")
    public void iSendLogAndPass(String log, String pass) {
loginPage.logIN(log,pass);
    }
    @Before("@OpenLogin")
    public void openPage(){
        driver.get("https://demoqa.com/login");
    }

    @Then("Chek result {string}")
    public void chekResult(String result) {
        Assert.assertEquals(Boolean.valueOf(result),loginPage.checkPASS());
    }
}
