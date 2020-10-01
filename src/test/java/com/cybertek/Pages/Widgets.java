package com.cybertek.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Widgets {
    @FindBy(xpath = "//span[contains(text(),'Accordian')]")
    public WebElement accordian;
    @FindBy(xpath = "//span[contains(text(),'Auto Complete')]")
    public WebElement autoComplete;
    @FindBy(xpath = "//span[contains(text(),'Date Picker')]")
    public WebElement dataPicker;
    @FindBy(xpath = "//span[contains(text(),'Slider')]")
    public WebElement slider;
    @FindBy(xpath = "//span[contains(text(),'Progress Bar')]")
    public WebElement progressBar;
    @FindBy(xpath = "//span[contains(text(),'Tabs')]")
    public WebElement tabs;
    @FindBy(xpath = "//span[contains(text(),'Tool Tips')]")
    public WebElement toolTips;
    @FindBy(xpath = "(//span[contains(text(),'Menu')])[1]")
    public WebElement menu;
    @FindBy(xpath = "//span[contains(text(),'Select Menu')]")
    public WebElement selectMenu;
}
