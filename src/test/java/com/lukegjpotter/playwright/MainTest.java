package com.lukegjpotter.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void main() {
        assertTrue(true);
    }

    @Test
    void testPlaywrightLoads() {
        String actualTitle;
        String expectedTitle = "Playwright";

        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            page.navigate("http://playwright.dev");
            actualTitle = page.title();
        }

        assertEquals(expectedTitle, actualTitle);
    }
}