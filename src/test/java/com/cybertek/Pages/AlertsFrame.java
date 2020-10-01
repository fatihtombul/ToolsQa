package com.cybertek.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsFrame {
    @FindBy(xpath = "//span[contains(text(),'Browser Windows')]")
    public WebElement browser;
    @FindBy(xpath = "//span[contains(text(),'Alerts')]")
    public WebElement alerts;
    @FindBy(xpath = "//span[text()='Frames']")
    public WebElement frames;
    @FindBy(xpath = "//span[text()='Nested Frames']")
    public WebElement nestedFrames;
    @FindBy(xpath = "//span[contains(text(),'Modal Dialogs')]")
    public WebElement modalDialogs;




}
