package steps;

import configuration.BaseClass;
import data.User;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.PageFactory;
import pages.FormPage;

import java.util.List;
import java.util.Random;

public class FormStep extends BaseClass {
    static {
        if (driver == null) {
            BaseClass.create();
        }
    }
FormPage formPage= PageFactory.initElements(driver,FormPage.class);
    @And("I fill form")
    public void iFillForm(DataTable dataTable) {
        List<List<String>> list = dataTable.asLists();
        Random random = new Random();
        int i = random.nextInt(list.size());
        User user = new User(list.get(i).get(0),
                list.get(i).get(1),
                list.get(i).get(2));
        formPage.fillForm(user);
    }
}
