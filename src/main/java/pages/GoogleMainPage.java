package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {
    WebDriver driver;

    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "q")
    WebElement searchFiled;

    public void search(String world){
        searchFiled.sendKeys(world);
        searchFiled.sendKeys(Keys.ENTER);
    }



}
