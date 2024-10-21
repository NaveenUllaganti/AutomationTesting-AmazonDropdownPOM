package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage {
    private WebDriver driver;

    @FindBy(xpath = "//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']")
    private WebElement allDropdown;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to list all dropdown options
    public void listAllOptions() {
        Select dropdown = new Select(allDropdown);
        List<WebElement> options = dropdown.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }

    // Method to select an option by value
    public void selectByValue(String value) {
        Select dropdown = new Select(allDropdown);
        dropdown.selectByValue(value);
    }

    // Method to select an option by index
    public void selectByIndex(int index) {
        Select dropdown = new Select(allDropdown);
        dropdown.selectByIndex(index);
    }

    // Method to select an option by visible text
    public void selectByVisibleText(String visibleText) {
        Select dropdown = new Select(allDropdown);
        dropdown.selectByVisibleText(visibleText);
    }
}
