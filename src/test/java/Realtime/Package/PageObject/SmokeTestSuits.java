package Realtime.Package.PageObject;

import Realtime.Package.Factory.DriverFactory;
import Realtime.Package.PageObject.*;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SmokeTestSuits extends DriverFactory {
    private HomePage homePage = new HomePage();
    private Helpers helpers = new Helpers();
    private ResultPage resultPage = new ResultPage();
    private RevisionHomework revisionHomework = new RevisionHomework();


    @Test
    public void priceRangeTest(){
        homePage.dosearch("nike");
        helpers.sleep(3000);

        resultPage.selectPrices();
        List<Double> actuallist = resultPage.allSelectedProductsOnFilter();
       Assert.assertThat(actuallist, Matchers.everyItem(Matchers.greaterThanOrEqualTo(10.00)));
        Assert.assertThat(actuallist,Matchers.everyItem(Matchers.lessThanOrEqualTo(15.00)));

        //resultPage.selectPrices("£10 - £15");
        //resultPage.allSelectedProductsOnFilter();

        resultPage.sortBy();
       resultPage.selectedLowToHighProducts();
        resultPage.addtotrolley();

        revisionHomework.pricerangetest();
        List<Double> actuallist1 = revisionHomework.filterProducts();
        Assert.assertThat(actuallist1,Matchers.everyItem(Matchers.greaterThanOrEqualTo(10.00)));
        Assert.assertThat(actuallist1,Matchers.everyItem(Matchers.lessThanOrEqualTo(15.00)));


    }

}
