package com.cybertek.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookStore {
    @FindBy(xpath = "//span[contains(text(),'Login')]")
    public WebElement login;

}
