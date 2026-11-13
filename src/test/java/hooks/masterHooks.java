package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.driver_factory;

public class masterHooks {
//    @After
//    public void takeScraenshotOnFailure(Scenario scenario) {
//
//        if (scenario.isFailed()) {
//            TakesScreenshot ts = (TakesScreenshot) driver_factory.getDriver();
//            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//            scenario.attach(src, "image/png", "screenshot");
//        }
//
//        driver_factory.getDriver().close();
//    }


 //@After
//       public void tearDown() {
//        driver_factory.getDriver().close();

   // @Before // runs before each method
//         public void setup(){
//
//         }

    @After //runs after each scenario
    public void takeScraenshotOnFailure(Scenario sc) throws InterruptedException {
        if (sc.isFailed()) {
            Thread.sleep(2000);
            String screenshotName = sc.getName().replaceAll(" ", "_");
            //get the name of the scenario and replace spaces with underscores bocause spaces are not allowed in file names

            final byte[] screenshot = ((TakesScreenshot) driver_factory.getDriver()).getScreenshotAs(OutputType.BYTES);

            sc.attach(screenshot, "image/png", screenshotName);
            // attach method is used to attach the screenshot to the report

            // with the name of the scenario and the format of the screenshot
        }
        driver_factory.getDriver().quit();
    }

}
