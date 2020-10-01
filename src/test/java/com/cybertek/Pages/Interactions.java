package com.cybertek.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Interactions {
    @FindBy(xpath = "//span[contains(text(),'Sortable')]")
    public WebElement sortable;
    @FindBy(xpath = "//span[contains(text(),'Selectable')]")
    public WebElement selectable;
    @FindBy(xpath = "//span[contains(text(),'Resizable')]")
    public WebElement resizable;
    @FindBy(xpath = "//span[contains(text(),'Droppable')]")
    public WebElement droppable;
    @FindBy(xpath = "//span[contains(text(),'Dragabble')]")
    public WebElement dragabble;


}
