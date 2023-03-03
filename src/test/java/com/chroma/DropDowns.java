package com.chroma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://chroma-tech-academy.mexil.it/static_page/");

        Select dropDown = new Select(driver.findElement(By.id("dropdown-class-example")));

        //dropDown.selectByIndex(2);
        //dropDown.selectByValue("option3");
        //dropDown.selectByVisibleText("Option1");


        Thread.sleep(2000);
        driver.close();
    }

}
