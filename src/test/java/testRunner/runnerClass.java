package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(features ={"src/test/resources/Features"},
            glue = {"stepDefinitions","hooks"},
           tags = "@homepages or @sanity",
         plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

    public class runnerClass extends AbstractTestNGCucumberTests {
//

}
