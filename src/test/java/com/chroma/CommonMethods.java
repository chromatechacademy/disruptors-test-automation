package com.chroma;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {

    public static WebDriver driver;

    /**
     * Use this method to launch chrome and navigate to a website
     * 
     * @param url
     */
    public static void launchChrome(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
    }

    /**
     * Use this method to launch firefox and navigate to a website
     * 
     * @param url
     */
    public static void launchFirefox(String url) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
    }

    /**
     * Use this method to launch edge and navigate to a website
     * 
     * @param url
     */
    public static void launchEdge(String url) {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
    }

    /**
     * Use this method to sleep a program
     * 
     * @param sleepTime
     */
    public static void sleep(int sleepTime) {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Use this method to scroll into an element
     * 
     * @param element
     */
    public static void scrollIntoElement(WebElement element) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);",
                element);
    }

    /**
     * Use this method to assert a boolean condition with a message
     * 
     * @param flag
     * @param message
     */
    public static void assertTrueWithMessage(boolean flag, String message) {

        try {
            Assert.assertTrue(flag, message);
        } catch (Error e) {
            e.printStackTrace();
        }
    }

    /**
     * Use this method to assert an actual value with an expected value with message
     * 
     * @param actual
     * @param expected
     * @param message
     */
    public static void assertEqualsWithMessage(String actual, String expected, String message) {
        try {
            Assert.assertEquals(actual, expected, message);
        } catch (Error e) {
            e.printStackTrace();
        }
    }

    /**
     * Use this method to dynamically locate an element using exact text
     * @param text
     * @return
     */
    public static WebElement dynamicTextLocator(String text) {
        return driver.findElement(By.xpath("//*[text()='" + text + "']"));
    }
}