package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class TestComponent  {

    final WebDriver WEB_DRIVER;

    public TestComponent() {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WEB_DRIVER = new ChromeDriver();
    }

    @Test
    public void Login() {
        // Login Details
        final String USER_ID = "mngr247362";
        final String PASSWORD = "Ytezaqe";

        WEB_DRIVER.get("http://demo.guru99.com/V4/index.php");
        WEB_DRIVER.findElement(By.name("uid")).sendKeys("mngr247362");
        WEB_DRIVER.findElement(By.name("password")).sendKeys("Ytezaqe");
        WEB_DRIVER.findElement(By.name("btnLogin")).click();
        String expectedUrl = WEB_DRIVER.getCurrentUrl();
        Assert.assertEquals(expectedUrl,"http://demo.guru99.com/V4/manager/Managerhomepage.php");
        WEB_DRIVER.close();
    }

    @Test
    public void MissingPasswordLogin() {
        System.out.println("This method to test fail");
        Assert.assertTrue(false);
    }

}

