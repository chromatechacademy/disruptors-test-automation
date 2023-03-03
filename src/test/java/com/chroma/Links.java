package com.chroma;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://chroma-tech-academy.mexil.it/static_page/");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println("NUMBER OF LINKS ON WEBPAGE: " + allLinks.size());

        for(WebElement link : allLinks){
            String text = link.getText();
            System.out.println("TEXT OF LINK IS: " + text);
        }

        Thread.sleep(2000);
        driver.close();
    }

}
