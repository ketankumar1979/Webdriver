package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyDemo {
    @Test
    public void startcar(){
        System.out.println("this is start car");
        Assert.fail();
    }
    @Test(dependsOnMethods ={"startcar"} )
    public void drivecar(){
        System.out.println("this is drive car");
    }
    @Test(dependsOnMethods = {"startcar","drivecar"},alwaysRun = true)
    public void parkcar(){
        System.out.println("this is park car");
    }
}
