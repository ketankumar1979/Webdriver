package TestNG;

import org.testng.annotations.Test;

public class GroupDemo {
    @Test(groups = {"sanitytest"})
    public void test1(){
        System.out.println("this is test 1");
    }
    @Test(groups = {"regressiontest"})
    public void test2(){
        System.out.println("this is test2");
    }

    @Test(groups = {"regressiontest"})
    public void test3(){
        System.out.println("this is test 3");
    }

    @Test(groups = {"sanitytest","regressiontest"})
    public void test4(){
        System.out.println("this is test 4");
    }
}
