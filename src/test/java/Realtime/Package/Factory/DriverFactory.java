package Realtime.Package.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;


    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }
    public void openbrowser(){
        driver = new FirefoxDriver();
         driver.get("https://www.argos.co.uk/");
    }
    public void maximisebrowser(){
        driver.manage().window().maximize();
    }
    public void implicittime(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void closebrowser(){
        driver.quit();
    }
}
