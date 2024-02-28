package com.ebay.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectHelper extends BaseHelper {

    public SelectHelper(WebDriver driver) {
        super(driver);
    }

    //        click(By.xpath("(//a[.='Elektronik'])"));
    public void clickOnDepartmentLink(int numberPosition) {
        if (numberPosition >= 0 && numberPosition < 10) {
            click(By.cssSelector("[data-currenttabindex='" + numberPosition + "']"));
        }
        //родитель
        //click(By.cssSelector("#vl-flyout-nav>ul>li:nth-child(" + department + ")"));
    }

    public void selectSelection(String type) {
        //click(By.cssSelector("[_sp='" + codePosition + "']"));
        //родитель .b-visualnav__tile:nth-child(" + type + ")
          click(By.cssSelector(".b-visualnav__tile:nth-child(" + type + ")"));
    }

    public void selectBrend(String brand) {
//        click(By.cssSelector("[href='https://www.ebay.de/b/Apple-Handys-Smartphones/9355/" + codePosition + "']"));
        click(By.xpath("//div[.='" + brand + "']"));
    }
}
