package com.chroma;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assertions extends CommonMethods {

    public static void main(String[] args) {

        CommonMethods.launchChrome("https://chroma-tech-academy.mexil.it/static_page/");

        String actualText = driver.findElement(By.xpath("//td[normalize-space()='Intro to IT']")).getText();

        System.out.println("ACTUAL TEXT IS: " + actualText);
        // Assert.assertEquals(actualText, "Intro to I");
        // Assert.assertEquals(actualText, "Intsdfgsdfg", "--- VERIFYING INTRO TO IT
        // TEXT ---");

        boolean flag = actualText.equals("sdfgfhsdfrght to IT");

        CommonMethods.assertTrueWithMessage(flag, "--- VERIFYING INTRO IT TEXT ---");

        SoftAssert softassert = new SoftAssert();

        softassert.assertTrue(flag, "--- VERIFYING INTRO TO IT USING SOFT ASSERT ---");

        softassert.assertAll();

        CommonMethods.sleep(2000);
        driver.quit();
    }

}
