package com.amazon.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Base {
    protected WebDriver driver;

    // Initialize WebDriver and setup basic configurations            
    public void initializeDriver() {
        // Setup WebDriverManager for Edge
        WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

        // Set implicit wait for 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Set page load timeout for 60 seconds
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

        // Delete all cookies
        driver.manage().deleteAllCookies();

        // Maximize browser window
        driver.manage().window().maximize();

        // Open Amazon
        driver.get("https://www.amazon.in");
    }

    // Quit driver
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
