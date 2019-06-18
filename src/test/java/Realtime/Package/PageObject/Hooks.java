package Realtime.Package.PageObject;
import Realtime.Package.Factory.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    // public static WebElement element;
    // public static WebDriver driver;
  private   DriverFactory driverFactory = new DriverFactory();

    @Before
    public void setup() {
        //driver = new FirefoxDriver();
        // driver.get("https://www.argos.co.uk/");
        // driver.manage() .window().maximize();
        // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driverFactory.openbrowser();
        driverFactory.maximisebrowser();
        driverFactory.implicittime();
       // driverFactory.closebrowser();

    }

    @After
   public void teardown() {
        // driver.quit();
        //driverFactory.closebrowser();


    }
}



