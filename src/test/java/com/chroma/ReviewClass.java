package com.chroma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReviewClass {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        driver.get("https://www.amazon.com/");

        String actualPageTitle = driver.getTitle();

        System.out.println("PAGE TITLE IS: " + actualPageTitle);

        try {
            Assert.assertEquals(actualPageTitle, "xfghdfgh ");

        } catch (java.lang.AssertionError e) {
            e.printStackTrace();
            System.out.println("FRIDAYS AT CHROMA TECH ARE FOR REAL MONEY MAKERS");
        }

        driver.close();

    }
}