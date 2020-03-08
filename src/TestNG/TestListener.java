package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Starting Test on: "+ result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName() + " has passed the tests.");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName() + " has failed the tests.");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("started the tests");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("finished tests.");
    }
}
