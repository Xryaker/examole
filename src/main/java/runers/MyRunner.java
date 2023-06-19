package runers;

import configuration.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/features",//path to feature files
        glue = "steps",//package path
        tags = "@SEARCHGOOGLE",//list feature files for run
        publish = true
)
public class MyRunner {
    @BeforeClass
    public static void bb() {
        System.setProperty("CUCUMBER_PUBLISH_TOKEN","f646945a-30c9-4a64-b082-5f7e39ae9f2c");
        BaseClass.create();

    }
    @AfterClass
    public static void aa() throws InterruptedException {
        Thread.sleep(3000);
        BaseClass.driver.quit();
    }

}
