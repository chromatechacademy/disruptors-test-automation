package com.chroma;

import org.openqa.selenium.By;

public class Frames extends CommonMethods {

    public static void main(String[] args) {
        CommonMethods.launchChrome("https://chroma-tech-academy.mexil.it/static_page/");

        CommonMethods.scrollIntoElement(
                CommonMethods.driver.findElement(By.xpath("//button[normalize-space()='Mouse Hover']")));

        driver.switchTo().frame("courses-iframe");

        driver.findElement(By.xpath("//p[contains(text(),'Courses')]")).click();

        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@value='Confirm']")).click();
        driver.switchTo().alert().accept();
        CommonMethods.sleep(2000);
        CommonMethods.driver.quit();
    }

}
