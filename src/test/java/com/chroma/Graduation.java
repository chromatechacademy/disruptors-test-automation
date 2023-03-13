package com.chroma;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Graduation {

    public static void main(String[] args) {

        /*
         * ASSERT LISTS AGAINST EACH OTHER
         */

        CommonMethods.launchChrome("https://chroma-tech-academy.mexil.it/static_page/");
        List<String> expectedValues = new ArrayList<>();

        expectedValues.add("John");
        expectedValues.add("David");
        expectedValues.add("Rocky");
        expectedValues.add("Rick");
        expectedValues.add("Carl");
        expectedValues.add("Johnson");
        expectedValues.add("Ghost");
        expectedValues.add("Levy");
        expectedValues.add("Mario");
        expectedValues.add("Luigi");

        List<WebElement> actualValues = CommonMethods.driver
                .findElements(By.xpath("(//table[@id='product'])[2]/tbody/tr/td[1]"));

                for (WebElement actualValue : actualValues) {
                    String text = actualValue.getText();
                    System.out.println(text);
                }

         Assert.assertEquals(actualValues, expectedValues, "---- COMPARING TWO LISTS ----");    

        CommonMethods.sleep(2000);
        CommonMethods.driver.quit();

    }

}
