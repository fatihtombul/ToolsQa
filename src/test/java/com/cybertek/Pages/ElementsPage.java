package com.cybertek.Pages;

import com.cybertek.TestBase;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class ElementsPage extends TestBase {

    @FindBy(xpath = "//span[contains(text(),'Text Box')]")
    public WebElement textBox;
    @FindBy(xpath = "//span[contains(text(),'Check Box')]")
    public WebElement checkBox;
    @FindBy(xpath = "//span[contains(text(),'Radio Button')]")
    public WebElement radioButton;
    @FindBy(xpath = "//span[contains(text(),'Web Tables')]")
    public WebElement webTables;
    @FindBy(xpath = "//span[contains(text(),'Buttons')]")
    public WebElement buttons;
    @FindBy(xpath = "(//span[contains(text(),'Links')])[1]")
    public WebElement links;
    @FindBy(xpath = "//span[contains(text(),'Broken Links - Images')]")
    public WebElement brokenLinks;
    @FindBy(xpath = "//span[contains(text(),'Upload and Download')]")
    public WebElement uploadDownload;
    @FindBy(xpath = "//span[contains(text(),'Dynamic Properties')]")
    public WebElement dynamicPro;















    @Test
    public void test1() throws InterruptedException {

       /* FirstPage.getFirstPageElements("Elements").click();
        Driver.get().navigate().back();
        Thread.sleep(3000);
        FirstPage.getFirstPagesElementsText("Forms");*/

        Driver.get().findElement(By.xpath("//div[@class='card-up']")).click();
    }
}