package com.chroma;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AssertTaskOne extends CommonMethods {

    public static void main(String[] args) {
        /*
         * TASK: LEVEL 1
         * 
         * Given a user is on the CTA practice page
         * Then instructors "Andres", "Luis", and "Haism" display in the course table
         * 
         * perform your assertions using the assertTrue method with a string message
         * 
         * 
         */

        launchChrome("https://chroma-tech-academy.mexil.it/static_page/");

        /**
         * ------ VERIFYING LUIS TEXT -------
         */
        String actualLuisText = driver.findElement(By.xpath("(//*[contains(text(),'Luis')])[1]")).getText();
        // optional - just want to see the actual text
        // System.out.println("ACTUAL TEXT IS: " + actualLuisText);
        boolean isLuisTextDisplayed = actualLuisText.equals("Luis");
        Assert.assertTrue(isLuisTextDisplayed, "---- VERIFYING LUIS TEXT ----");

        /**
         * ------ VERIFYING ANDRES TEXT -------
         */
        String actualAndresText = driver.findElement(By.xpath("(//*[contains(text(),'Andres')])[1]")).getText();
        Assert.assertTrue(actualAndresText.equals("Andres"), "---- VERIFYING ANDRES TEXT ----");

        /**
         * ------ VERIFYING HAISM TEXT -------
         */
        String actualHaismText = driver.findElement(By.xpath("(//*[contains(text(),'Haism')])[1]")).getText();
        boolean isHaismTextDisplayed = actualHaismText.equals("Haism");
        Assert.assertTrue(isHaismTextDisplayed, "---- VERIFYING HAISM TEXT ----");

        sleep(3000);
        driver.quit();

    }

}
