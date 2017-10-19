package com.willowtree;

import io.ddavison.conductor.Locomotive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by markhan on 8/1/17.
 */
public class CookieClickerHomePage extends BasePage{

    //Selectors
    private static final String BIG_COOKIE = "#bigCookie";
    private static final String COOKIE_COUNT= "#cookies.title";

    private static final String GRANDMA = "#product1.product.unlocked.enabled";
    private static final String CURSOR = "#product0.unlocked.enabled";



    // Locomotive
    public CookieClickerHomePage(Locomotive driver) {
        super(driver);
    }


    // THE MEAT
    public CookieClickerHomePage clickBigCookie() {
        getDriver().click(BIG_COOKIE);
        return this;
    }

    public int getNumberOfCookies() {
        // Converting strings "1,234 cookies" > "1234"
        String cookies = getDriver()
                .getText(COOKIE_COUNT)
                .split("\n") [0];

        // Removing all non-numberic numbers
        cookies = cookies.replaceAll("[^\\d]", "");
        return Integer.parseInt(cookies);

    }




    // Checking to see if we have enough cookies to upgrade things

    public boolean isGrandmaEnabled() {
        return getDriver().isPresent(GRANDMA);
    }

    public boolean isCursorEnabled() {
        return getDriver().isPresent(CURSOR);
    }



    // Selecting/Click Upgrades

    public CookieClickerHomePage clickGrandma() {
        getDriver().click(GRANDMA);
        return this;
    }

    public CookieClickerHomePage clickCursor() {
        getDriver().click(CURSOR);
        return this;
    }





}
