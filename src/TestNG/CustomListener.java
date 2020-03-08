package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

    //this belongs to ITestListener and will execute before starting the Test set/batch
    public void onStart(ITestContext arg)
    {
        System.out.println("Starts Test execution ......... " + arg.getName());
    }

    //this belongs to ITestListener and will execute after starting the Test set/batch
    public void onFinish(ITestContext arg)
    {
        System.out.println("Finish Test execution ......... " + arg.getName());
    }

    //this belongs to ITestListener and will execute before the main test start i.e. @Test
    public void onTestStart(ITestResult arg)
    {
        System.out.println("Starts Test ......... " + arg.getName());
    }

    //this belongs to ITestListener and will execute when a test is skipped
    public void onTestSkipped(ITestResult arg)
    {
        System.out.println("Skipped test ......... " + arg.getName());
    }

    //this belongs to ITestListener and will execute when a test passes
    public void onTestSuccess(ITestResult arg)
    {
        System.out.println("Passed test ......... " + arg.getName());
    }

    //this belongs to ITestListener and will execute when a test fails
    public void onTestFailure(ITestResult arg)
    {
        System.out.println("Failed test ......... " + arg.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestContext arg)
    { }

//    TESTING...

//    Branch test...

}
