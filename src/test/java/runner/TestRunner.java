package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
                 glue = "steps", 
                 plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-reports.json"},
                 //plugin = { "pretty", "html:target/cucumber-reports" },
                 tags = "@PracticasHerokuapp")
 
public class TestRunner {

    @BeforeClass
    public static void completeWindow(){
        BasePage.maxWindow();
    }

    @AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();
    }
}

