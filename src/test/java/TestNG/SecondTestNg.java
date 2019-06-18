package TestNG;

import org.testng.annotations.Test;

public class SecondTestNg {

    @Test(priority = 1)
    public void setup(){
        System.out.println( "This is set up test ");
    }

    @Test(priority = 2)
    public void addcustomer() {
        System.out.println("This is addcustomer test ");
    }
        @Test(priority = 3)
        public void searchcustomer(){
            System.out.println( "This is searchcustomer test ");
        }


    @Test(priority = 4)
    public void teardown(){
        System.out.println( "closing the browser");
    }

}
