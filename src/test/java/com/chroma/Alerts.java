package com.chroma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://chroma-tech-academy.mexil.it/static_page/#");

        driver.findElement(By.id("confirmbtn")).click();

        driver.switchTo().alert().accept();

        driver.findElement(By.id("confirmbtn")).click();

        String alertText = driver.switchTo().alert().getText();
        System.out.println("ALERT TEXT IS: " + alertText);
        driver.switchTo().alert().dismiss();

        Thread.sleep(2000);
        driver.close();
    }

}
