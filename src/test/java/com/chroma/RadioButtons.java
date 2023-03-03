package com.chroma;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://chroma-tech-academy.mexil.it/static_page/");

        WebElement radioButton2 = driver.findElement(By.xpath("(//input[@name='radioButton'])[2]"));

        radioButton2.click();

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='radioButton']"));

        System.out.println("NUMBER OF RADIO BUTTONS: " + radioButtons.size());

        for (WebElement radioButton : radioButtons) {
            radioButton.click();
        }

        Thread.sleep(2000);
        driver.close();
    }

}
