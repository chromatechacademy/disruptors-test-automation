package com.chroma;

import java.util.NoSuchElementException;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://www.amazon.com";

        driver.get(url);

        String pageTitle = driver.getTitle();
        System.out.println("PAGE TITLE IS: " + pageTitle);
        String currentUrl = driver.getCurrentUrl();
        System.out.println("URL IS: " + currentUrl);

        // WebElement giftCardsLink = driver.findElement(By.linkText("Gift Cards"));

        try {
            driver.findElement(By.linkText("cfvghjhdfcgh")).click();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            driver.findElement(By.id("nav-hamburger-menu")).click();
        }
        Thread.sleep(3000);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);",
                driver.findElement(By.xpath("(//div[@class='hmenu-item hmenu-title '])[4]")));

        driver.findElement(By.xpath("(//a[@class='hmenu-item hmenu-compressed-btn'])[2]")).click();

        js.executeScript("arguments[0].scrollIntoView(true);",
                driver.findElement(By.xpath("(//*[contains(text(),'Gift Cards')])[3]")));

        driver.findElement(By.xpath("(//*[contains(text(),'Gift Cards')])[3]")).click();

        driver.findElement(By.xpath("//*[contains(text(),'All gift cards')]")).click();

        Thread.sleep(3000);
        driver.close();
    }

}
