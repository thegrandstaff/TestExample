package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;


public class Assignment2
{
    public static void main(String[] args)
    {
        //path to access chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //goes to website with login
        driver.get("http://demo.guru99.com/test/login.html");

        //get email webelement
        WebElement email = driver.findElement(By.id("email"));

        //get password webelement
        WebElement password = driver.findElement(By.name("passwd"));

        //insert email
        email.sendKeys("fake@gmail.com");

        //insert password
        password.sendKeys("fakepassword");

        //find login button
        WebElement login = driver.findElement(By.id("SubmitLogin"));
        //click login button
        login.submit();

    }
}
