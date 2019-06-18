package Realtime.Package.PageObject;
import Realtime.Package.Factory.DriverFactory;
import Realtime.Package.PageObject.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ResultPage extends DriverFactory {



    // 1.
    @FindBy(css = ".ac-facet__filter.ac-facet__filter--default")
    List<WebElement> priceranges;



    public void selectPrices() {
       // List<WebElement> priceranges = driver.findElements(By.cssSelector(".ac-facet__filter.ac-facet__filter--default"));
        // select by Index
        WebElement price = priceranges.get(1);
        price.click();
    }
    @FindBy(css = ".ac-product-price__amount")
    List<WebElement> priceofselectedproducts;
   public List<Double> allSelectedProductsOnFilter() {
        List<Double> collectedprices = new ArrayList<Double>();
      // List<WebElement> priceofselectedproducts =driver.findElements(By.cssSelector(".ac-product-price__amount"));
        //List<WebElement> pricesofselectedproducts = driver.findElements(By.cssSelector(".ac-product-card.ac-product-card--default.ac-product-card"));
        for (WebElement priceofselectedproduct : priceofselectedproducts) {
           String stringvalue = priceofselectedproduct.getText().replaceFirst("£","");
            double valueindouble = Double.parseDouble(stringvalue);
            collectedprices.add(valueindouble);
            System.out.println(collectedprices);
        }
        return collectedprices;


           // for (double d=0;d<ar1.size();d++){
               // System.out.println(ar1.add(d));
            //}
           // System.out.println(collectedprices);
        }
           // return collectedprices;
    // 2.
    public void sortBy(){
        WebElement element = driver.findElement(By.cssSelector(".form-control.sort-select"));
        Select sel = new Select(element);
          sel.selectByIndex(1);
          element.click();

    }
    public List<Double> selectedLowToHighProducts(){
        List<Double> collectedlowtohigh = new ArrayList<Double>();
        List<WebElement> lowtohighprices = driver.findElements(By.cssSelector(".ac-product-price__amount"));
        for (WebElement lowtohighprice : lowtohighprices){
            String stringvalue = lowtohighprice.getText().replaceFirst("£","");
            Double valueindouble = Double.parseDouble(stringvalue);
            collectedlowtohigh.add(valueindouble);
            System.out.println(collectedlowtohigh);
            List<Double> expected = new ArrayList<Double>(collectedlowtohigh);
            Collections.sort(expected);
            Assert.assertEquals(collectedlowtohigh,expected);
        }
        return collectedlowtohigh;
    }

    // 3.
    public void addtotrolley() {
        List<WebElement> nikeproducts = driver.findElements(By.cssSelector(".ac-product-card.ac-product-card--default.ac-product-card"));
        Random rand = new Random();
        WebElement element = nikeproducts.get(rand.nextInt(nikeproducts.size()));
        element.click();
        WebElement selectedproduct = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[1]/div[2]/section[2]/section/div[5]/div[2]/button"));
        // WebElement selectedproduct = driver.findElement(By.cssSelector(".add-to-trolley-button "));
        selectedproduct.click();

    }

    public String getHeaderOfSearchProducts(){
       return driver.findElement(By.xpath("//*[@id=\"findability\"]/div/div[3]/div[1]/div[2]/div[1]/h1")).getText();

    }


    }



