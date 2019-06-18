package stepdefination;

import Realtime.Package.PageObject.HomePage;
import Realtime.Package.PageObject.ResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class SearchSteps {
HomePage homePage = new HomePage();
ResultPage resultPage = new ResultPage();

    @Given("^user on home page$")
    public void user_on_home_page() throws Throwable {

    String actual = homePage.getHomePageUrl();
        Assert.assertThat(actual,Matchers.endsWith("co.uk/"));

    }

    @When("^user search for a product$")
    public void user_search_for_a_product() throws Throwable {
        homePage.dosearch("nike");
        //String actual2 = homePage.getHomePageUrl();
        //Assert.assertThat(actual2,Matchers.endsWith("/search/nike/"));


    }
    @When("^user search for \"([^\"]*)\"$")
    public void user_search_for(String searchproduct) throws Throwable {
       homePage.dosearch(searchproduct);
    }



    @Then("^user can see respective products$")
    public void user_can_see_respective_products() throws Throwable {
    //String actual2 = resultPage.getHeaderOfSearchProducts();
    //Assert.assertThat(actual2,Matchers.equalToIgnoringCase("nike"));
    }


}
