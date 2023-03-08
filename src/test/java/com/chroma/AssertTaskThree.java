package com.chroma;

import org.openqa.selenium.By;

public class AssertTaskThree {

    public static void main(String[] args) {
        /**
         * TASK 3: for the brave
         * 
         * 
         */

        CommonMethods.launchChrome("https://chroma-tech-academy.mexil.it/static_page/");

        String actualJohnText = CommonMethods.dynamicTextLocator("John").getText();
        // System.out.println("ACTUAL TEXT IS: " + actualJohnText);
        CommonMethods.assertEqualsWithMessage(actualJohnText, "John", "--- VERIFING JOHN TEXT ---");

        CommonMethods.sleep(3000);
        CommonMethods.driver.quit();
    }

}
