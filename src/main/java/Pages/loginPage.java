package Pages;

import org.apache.xmlbeans.SchemaTypeLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.driver_factory;
import utilities.utilityFetchProperty;

import java.io.IOException;

public class loginPage {
   // public static SchemaTypeLoader driver;
    // static WebDriver driver;

    public static void sitenavigation() throws IOException, InterruptedException {
        // System.setProperty("webdriver.chrome.driver", "E:\\chromeDriver\\chromedriver.exe");
        //  driver = new ChromeDriver();
        // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver_factory.initializeddriver();  //WebDriver driver= new Chromedriver //classname.methodname
        driver_factory.getDriver().get(utilityFetchProperty.fetchPropertyValue("url"));// driver replacement>> driver_factory.getDriver()
        driver_factory.getDriver().manage().window().maximize();   //driver>> driver_factory.getDriver()
        Thread.sleep(1000);
    }

    public static void loginpage(String username, String password) throws InterruptedException {
        Thread.sleep(2000);
       WebElement Username= driver_factory.getDriver().findElement(By.xpath("//input[@name='username']"));
       Username.sendKeys(username);
       WebElement Password= driver_factory.getDriver().findElement(By.xpath("//input[@type='password']"));
       Password.sendKeys(password);
       WebElement Submit= driver_factory.getDriver().findElement(By.xpath("//button[@type='submit']"));
        Submit.click();


    }

    public static void homePageNavigation() {
        String actualurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String expectedurl = driver_factory.getDriver().getCurrentUrl();
        if (actualurl.contentEquals(expectedurl)) {
            System.out.println("Test case is passed");
        } else {
            System.out.println("Test case is failed");
        }
        //  public static void teardown () {
        driver_factory.getDriver().quit();
    }
    public static void logout(){

        driver_factory.getDriver().findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
        driver_factory.getDriver().findElement(By.xpath("//a[text()='Logout']")).click();
    }
}


