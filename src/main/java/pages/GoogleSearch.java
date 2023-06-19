package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class GoogleSearch {
    @FindBy(xpath = "//div[@jsname=\"xQjRM\"]//a")
    List<WebElement> webElementList;

    public List<String> getAllUrlLinks(){
        List<String> stringList=new ArrayList<>();
        for (WebElement element : webElementList) {
            stringList.add(element.getAttribute("href"));
        }
        return stringList;
    }
}
