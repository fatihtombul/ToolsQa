package com.cybertek.Pages;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy (xpath ="//div[@class='card-up'" )
    public WebElement elements;

    @FindBy(xpath = "(//div[@class='card-up'])[2]")
    public WebElement Forms;

    @FindBy(xpath = "(//div[@class='card-up'])[3]")
    public WebElement Alerts;

    @FindBy(xpath = "(//div[@class='card-up'])[4]")
    public WebElement widgets;

    @FindBy(xpath = "(//div[@class='card-up'])[5]")
    public WebElement cards;

    @FindBy(xpath = "(//div[@class='card-up'])[6]")
    public WebElement bookStore;

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);

    }




    public static WebElement getFirstPageElements(String elementName) {
        WebElement element = Driver.get().findElement(By.xpath("//h5[text()='" + elementName + "']/../../.."));
        return element;
    }

    public static String getFirstPagesElementsText(String str) {
        str = Driver.get().findElement(By.xpath("//h5[text()='" + str + "']")).getText();
        System.out.println(str);
        return str;
    }
}

