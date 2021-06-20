package com.hepsiemlak;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

public class BasePage extends Base {

    WebElement webElement = null;


    public WebElement webElementiBul(String key, String value) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);

        switch (key) {
            case "id":
                webElement = wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.id(value))));
                webElement.click();
                break;
            case "css":
                webElement = wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.cssSelector(value))));
                webElement.click();
                break;
            case "xpath":
                webElement = wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath(value))));
                webElement.click();
                break;
            case "classname":
                webElement = webDriver.findElement(By.className(value));
                webElement.click();
                break;
            case "name":
                webElement = webDriver.findElement(By.name(value));
                webElement.click();
                break;
            case "linkText":
                webElement = webDriver.findElement(By.linkText(value));
                webElement.click();
                break;
            default:
                System.out.println("TestClass içerisinde Web Elementi Bul fonksiyonu düzgün çalışmadı...");
                break;
        }
        return webElement;
    }

    public void webElementineGönder(String key, String value, String sendingValue) {
        webElement = webElementiBul(key, value);
        webElement.sendKeys(sendingValue);
    }

    public void webElementControl(String expected, String actual) {
        Assert.assertEquals(expected, actual);
    }

    public void webelementiBekle(int i) throws InterruptedException {
        Thread.sleep(i * 1000);
    }

    public void webElementMoveTo(By by) {
        webElement = webDriver.findElement(by);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webElement).build().perform();

    }

    public void webElementiBuluncaTikla(String webelement) {
        WebElement element = webDriver.findElement(By.cssSelector(webelement));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void webElementDropDown(String value, int key) {
        Select dropdown = new Select(webDriver.findElement(By.cssSelector(value)));
        dropdown.selectByIndex(key);
    }

    public void isValidPhoneNumb(String number) {
        Pattern pattern = Pattern.compile("(([\\+]90?)|([0]?))([ ]?)((\\([0-9]{3}\\))|([0-9]{3}))([ ]?)([0-9]{3})(\\s*[\\-]?)([0-9]{2})(\\s*[\\-]?)([0-9]{2})");
        Matcher matcher = pattern.matcher(number);
        assertTrue(matcher.matches());
        System.out.println("Phone number is valid.");
    }
}
