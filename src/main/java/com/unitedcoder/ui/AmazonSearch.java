package com.unitedcoder.ui;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonSearch {
    static  WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        //add chromedriver reference to the system
        //define a webdriver and chrome options
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver(chromeOptions);
        //open the browser
        driver.manage().window().maximize(); //maximize the browser window
        driver.get("https://www.amazon.com");
        //find the search field and type a search word
        searchAKeyword("iphone");
        sleep(5);
        //verify the result
        WebElement result=driver.findElement(By.cssSelector("h2.a-size-base.a-spacing-small.a-spacing-top-small.a-text-normal"));
        System.out.println("Result displayed? "+result.isDisplayed());
        //verify that search result is more than 1 million
        String searchResult=result.getText();
        System.out.println(searchResult);
        //close the browser and quit
        //driver.close();
        driver.quit();
    }
    public static void waitUntilElementIsVisible(WebElement webElement)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void searchAKeyword(String keywordToSearch)
    {
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        waitUntilElementIsVisible(searchBox);
        searchBox.sendKeys(keywordToSearch+ Keys.ENTER);
    }

    public static void sleep(int seconds)
    {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
