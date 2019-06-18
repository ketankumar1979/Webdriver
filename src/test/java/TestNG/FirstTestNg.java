package TestNG;

import javafx.scene.layout.Priority;
import org.testng.annotations.Test;

import java.util.PriorityQueue;

public class FirstTestNg {

   @Test(priority = 3)
    public void setup(){
        System.out.println( "This is set up test ");
    }

    @Test(priority = 2)
    public void logintest(){
        System.out.println( "This is Login test ");

    }
    @Test(priority = 1)
    public void teardown(){
        System.out.println( "This is tear down test ");
    }

}
