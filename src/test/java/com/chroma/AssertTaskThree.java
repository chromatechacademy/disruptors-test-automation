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

        /*
         * VERIFYING JOHN TEXT
         */
        String actualJohnText = CommonMethods.dynamicTextLocator("John").getText();
        CommonMethods.assertEqualsWithMessage(actualJohnText, "John", "--- VERIFYING JOHN TEXT ---");

        /*
         * VERIFYING DAVID TEXT
         */
        String actualDavidText = CommonMethods.dynamicTextLocator("David").getText();
        CommonMethods.assertEqualsWithMessage(actualDavidText, "David", "--- VERIFYING DAVID TEXT ---");

        /*
         * VERIFYING ROCKY TEXT
         */
        String actualRockyText = CommonMethods.dynamicTextLocator("Rocky").getText();
        CommonMethods.assertEqualsWithMessage(actualRockyText, "Rocky", "--- VERIFYING ROCKY TEXT ---");

        CommonMethods.scrollIntoElement(CommonMethods.dynamicTextLocator("Luigi"));
        CommonMethods.sleep(3000);
        CommonMethods.driver.quit();
    }

}
