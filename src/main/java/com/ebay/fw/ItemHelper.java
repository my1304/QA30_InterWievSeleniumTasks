package com.ebay.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ItemHelper extends BaseHelper {
    public ItemHelper(WebDriver driver) {
        super(driver);
    }


    public String getSecondItemName(String number) {
//        return driver.findElement(By.cssSelector("[href='https://www.ebay.de/b/iPhone-13-Pro/9355/" +
//                codePosition + "']")).getText();
        //.s-item:nth-child(2) h3
        return driver.findElement(By.cssSelector(".s-item:nth-child(" + number + ") h3")).getText();
    }

    public void enterItemNameToSearchBar(String ItemName) {
        //type(By.cssSelector(".ui-autocomplete-input"), ItemName);
        type(By.id("gh-ac"), ItemName);
        click(By.id("gh-btn"));
    }

    //************ Problem Situasion *************************************
    public String getFirstItemName(String Code) {
        return driver.findElement(By.cssSelector(".s-item__dsa-on-bottom.s-item__pl-on-bottom:nth-child(" + Code + ") div:nth-child(2)>a>div>span")).getText();
        //        String st = driver.findElement(By.cssSelector(".srp-results:nth-child(1)")).getText();
//        String st = driver.findElement(By.xpath("//body/div[4]/div[4]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[2]/a[1]/div[1]/span[1]")).getText();
//                   String st = driver.findElement(By.xpath("//body/div[4]/div[4]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[2]/a[1]/div[1]/span[2]")).getText();

  //      return driver.findElement(By.cssSelector("[_sp='" + Code + "']>div>span")).getText();
//return driver.findElement(By.cssSelector("#item" + Code + ".s-item__title>span")).getText(); //"57518346a5 "
    }
// for Remember - //ul/li/div/div[2]/a/div/span
//************************ End ********************************
}
/*

//body/div[4]/div[4]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/div[1]
//body/div[4]/div[4]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/div[1]
//body/div[4]/div[4]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/div[1]
//body/div[4]/div[4]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[2]/a[1]/div[1]/span[1]
*/
