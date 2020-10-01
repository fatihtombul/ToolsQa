package com.cybertek.Pages;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    public void navigateToModule(){
        WebElement element = Driver.get().findElement(By.xpath("//span[text()='Text Box']"));
    }
}
