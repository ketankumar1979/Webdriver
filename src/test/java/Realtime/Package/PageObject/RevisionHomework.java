package Realtime.Package.PageObject;

import Realtime.Package.Factory.DriverFactory;
import Realtime.Package.PageObject.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RevisionHomework extends DriverFactory {
// test 1
    public void pricerangetest(){
        List<WebElement> priceranges1 = driver.findElements(By.cssSelector(".ac-facet__filters.ac-facet__filters--default"));
        WebElement pricerange1 = priceranges1.get(1);
        pricerange1.click();

    }
    public List<Double> filterProducts(){
        List<Double> collectedprices1 = new ArrayList<Double>();
        List<WebElement> prices1 = driver.findElements(By.cssSelector(".ac-product-price"));
        for (WebElement price1 : prices1){
            String valueinstring1 = price1.getText().replaceFirst("£","");
            double valueindouble1 = Double.parseDouble(valueinstring1);
            collectedprices1.add(valueindouble1);
            System.out.println(collectedprices1);

        }
        return collectedprices1;
    }

    // test 2

    public void sortby1 (){
        WebElement element = driver.findElement(By.cssSelector(".form-control.sort-select"));
        Select sel = new Select(element);
        sel.selectByIndex(1);
        element.click();
    }

    public List<Double> lowtohighpoducts(){
        List<Double> collectedlowtohighprices1 = new ArrayList<Double>();
        List<WebElement> lowtohighprices1 = driver.findElements(By.cssSelector(".ac-product-price__amount"));
        for (WebElement lowtohighprice1 : lowtohighprices1){
            String stringlowtohighvalue1 = lowtohighprice1.getText().replaceFirst("£","");
            double doublelowtohighvalue1 = Double.parseDouble(stringlowtohighvalue1);
            collectedlowtohighprices1.add(doublelowtohighvalue1);
            System.out.println(collectedlowtohighprices1);
            List<Double> expected1 = new ArrayList<Double>(collectedlowtohighprices1);
            Collections.sort(expected1);
            Assert.assertEquals(expected1,collectedlowtohighprices1);

        }
        return collectedlowtohighprices1;
    }

    //test 3
    public void addtotrolley1(){
        List<WebElement> nikeproducts1 = driver.findElements(By.cssSelector(".ac-product-card.ac-product-card--default.ac-product-card--borderless"));
        Random random = new Random();
        WebElement element = nikeproducts1.get(random.nextInt(nikeproducts1.size()));
        element.click();
        WebElement selectedproduct1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[1]/div[2]/section[2]/section/div[5]/div[2]/button"));
        selectedproduct1.click();
    }
}
