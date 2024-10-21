package com.amazon.tests;

import com.amazon.base.Base;
import com.amazon.pages.HomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends Base {
    private HomePage homePage;

    @BeforeTest
    public void setUp() {
        initializeDriver();  // Set up WebDriver and load Amazon
        homePage = new HomePage(driver);  // Initialize HomePage with WebDriver
    }

    @Test(priority = 1)
    public void listAllDropdownOptions() {
        homePage.listAllOptions();  // List all options in dropdown
    }

    @Test(priority = 2)
    public void selectAmazonFreshMeat() {
        homePage.selectByValue("search-alias=freshmeat");  // Select Amazon Fresh (Meat) by value
    }

    @Test(priority = 3)
    public void selectByIndex() {
        homePage.selectByIndex(1);  // Select option by index (index 1)
    }

    @Test(priority = 4)
    public void selectByVisibleText() {
        homePage.selectByVisibleText("Amazon Devices");  // Select option by visible text
    }

    @AfterTest
    public void tearDown() {
        driver.quit();  // Quit the browser
    }
}
