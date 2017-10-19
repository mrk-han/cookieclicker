package com.willowtree;

import io.ddavison.conductor.Config;
import org.junit.Test;

@Config(
        timeout = 50,
        retries = 50
)

/**
 * Created by markhan on 8/1/17.
 */
public class CookieClickerTest extends BaseTest {

    @Test
    public void click_cookie_ten_times() {
        CookieClickerHomePage homePage = new CookieClickerHomePage(this);
        while (true) {
            homePage.clickBigCookie();
            if (homePage.isGrandmaEnabled()) {
                homePage.clickGrandma();
            }
        }
    }

    @Test
    public void click_and_upgrade_cursor() {
        CookieClickerHomePage homePage = new CookieClickerHomePage(this);
        while (true) {
            homePage.clickBigCookie();
            if (homePage.isCursorEnabled()) {
                homePage.clickCursor();
            }
        }
    }


}
