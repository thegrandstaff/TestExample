package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Assignment3
{
    public static void main(String[] args) //throws InterruptedException
    {
        //Assignment 3
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //goes to website with login
        driver.get("https://www.autorentals.com");

        //get pick-up location webelement
        WebElement location = driver.findElement(By.id("pickup"));
        //insert location - "Toronto, ON"
        location.sendKeys("Toronto, ON");

        //remove beginning and end comment (/* and */ when you change the selected dates)

        /*
        // pick-up date/time
        //get pick-up date webelement
        WebElement pickupDate = driver.findElement(By.id("pickup-date"));
        pickupDate.click();
        Thread.sleep(1000); //requires throws InterruptedException
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[6]/a")).click();

        // pick-up time
        driver.findElement(By.xpath("//*[@id=\"pickup-time-selected\"]")).click();
        Thread.sleep(1000); //requires throws InterruptedException
        driver.findElement(By.xpath("//*[@id=\"pickup-time\"]/li[25]")).click();

        //drop-off date
        WebElement dropOffDate = driver.findElement(By.id("dropoff-date"));
        dropOffDate.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[5]/td[2]/a")).click();

        //drop-off time
        WebElement dropOffTime = driver.findElement(By.id("dropoff-time-selected"));
        dropOffTime.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"dropoff-time\"]/li[25]")).click();

         */

        //select "Search"
        //find search button element
        WebElement search = driver.findElement(By.id("find-car-deals"));
        //click search button
        search.click();
    }
}
