package steps;

import configuration.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.index.qual.SearchIndexBottom;
import org.openqa.selenium.support.PageFactory;
import pages.GoogleMainPage;
import pages.GoogleSearch;

public class GoogleStep extends BaseClass {
    static {
        if (driver == null) {
            BaseClass.create();
        }
    }

    GoogleMainPage googleMainPage = new GoogleMainPage(driver);
    GoogleSearch googleSearch= PageFactory.initElements(driver,GoogleSearch.class);
    @When("I open site {string}")
    public void iOpenSite(String url) {
        driver.get(url);
    }

    @And("I send search word {string} in google search field")
    public void iSendSearchWordInGoogleSearchField(String word) {
        googleMainPage.search(word);
    }

    @Then("Print all url links")
    public void printAllUrlLinks() {
        for (String link : googleSearch.getAllUrlLinks()) {
            System.out.println(link);
        }
    }

    @Before("@SEARCH")
    public void str(){
        System.out.println("Hello");
    }

}
