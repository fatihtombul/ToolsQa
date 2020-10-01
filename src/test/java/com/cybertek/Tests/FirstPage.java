package com.cybertek.Tests;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstPage {
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