package Realtime.Package.PageObject;

import Realtime.Package.Factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {
    @FindBy(id = "searchTerm")
    WebElement SearchTextBox;

    @FindBy(css = "._2mKaC")
    WebElement magnifierGlass;

    public void dosearch(String item){
        SearchTextBox.sendKeys(item);
        magnifierGlass.click();
        //driver.findElement(By.id("searchTerm")).sendKeys(item);
        //driver.findElement(By.className("_2mKaC")).click();
    }
    public String getHomePageUrl(){
         return driver.getCurrentUrl();
    }
}
