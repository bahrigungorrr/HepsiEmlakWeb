package com.hepsiemlak;

import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.log4j.Logger;

public class Base {

    WebDriver webDriver;
    ChromeOptions options = new ChromeOptions();
    public Logger log = Logger.getLogger(Base.class);

    @Before
    public void setUp() {
        BasicConfigurator.configure();
        log.info("------Web Tesler Başlatıyor-------");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver1.exe");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");

        webDriver = new ChromeDriver(options);
        webDriver.get("https:/www.hepsiemlak.com");
    }

    @After
    public void tearDown() { webDriver.quit();
    }

}
