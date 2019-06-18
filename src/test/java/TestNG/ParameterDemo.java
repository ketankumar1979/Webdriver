package TestNG;

import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser","url"})
    public void setup(String browser,String app){

        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }

      driver.get("https://learn.letskodeit.com/p/practice");
    }

    @Test(priority=1)
    public void bmwradio(){

        driver.findElement(By.id("bmwradio")).click();
    }

    @Test(priority = 2)
    public void benzradio(){
        driver.findElement(By.id("benzradio")).click();

    }


}
