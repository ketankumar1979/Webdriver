package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelDemo {

    WebDriver driver;

    // to run classes parallel then create another row of class name and give classes in parallel name with thread count.
    // to run test suits parallel then create another test under suit. then give tests in parallel name with thread count.
    @Test
    public void bmw(){
        driver = new FirefoxDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();
        driver.findElement(By.id("bmwradio")).click();
    }
    @Test
    public void benz(){
        driver = new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();
        driver.findElement(By.id("benzradio")).click();
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }


}
