package Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class ListnerdemoIlistner implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println(" start execution");
   }
    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("test is sucess");
    }
    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println(" test is failure");
    }
    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println(" test is skipped");
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println(" not important ");
    }
    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println(" start test");
   }
    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println(" finish test");

   }
}
