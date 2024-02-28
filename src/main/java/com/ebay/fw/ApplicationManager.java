package com.ebay.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class ApplicationManager {
    static WebDriver driver;
    Logger logger = LoggerFactory.getLogger(ApplicationManager.class);
    String browser;


    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    SelectHelper select;
    ItemHelper item;

    public void init() {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            logger.info("Test start in Chrom Browser");
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            logger.info("Test start in firefox Browser");
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
            logger.info("Test start in edge Browser");
        }
        WebDriverListener listener = new MyListener();
        driver = new EventFiringDecorator<>(listener).decorate(driver);
        driver.get("https://www.ebay.de");
        logger.info("Current " + driver.getCurrentUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        select = new SelectHelper(driver);
        item = new ItemHelper(driver);
    }

    public SelectHelper getSelect() {
        return select;
    }

    public ItemHelper getItem() {
        return item;
    }

    public void stop() {
        driver.quit();
    }

}