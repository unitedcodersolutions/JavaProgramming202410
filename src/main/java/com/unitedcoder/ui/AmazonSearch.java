package com.unitedcoder.ui;

import com.unitedcoder.io.FileUtility;
import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
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
        driver.get("https://www.amazon.com"); //open website
        takeScreenShot("image","amazon-main.png");
        //find the search field and type a search word
        searchAProduct("iphone");
        takeScreenShot("image","iphone-search.png");
        sleep(10);
        //verify the result
        WebElement result=driver.findElement(By.cssSelector("h2.a-size-base.a-spacing-small.a-spacing-top-small.a-text-normal"));
        System.out.println("Result displayed? "+result.isDisplayed());
        //verify that search result is more than 1 million
        String searchResult=result.getText();
        System.out.println(searchResult);
        if(searchResult.toLowerCase().contains("iphone"))
            System.out.println("Test passed");
        else
        { System.out.println("Test failed");}

        //close the browser and quit
        driver.quit();
    }
    public static void waitUntilElementIsVisible(WebElement webElement)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void searchAProduct(String productToSearch)
    {
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        waitUntilElementIsVisible(searchBox);
        searchBox.sendKeys(productToSearch+ Keys.ENTER);
    }

    public static void sleep(int seconds)
    {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void takeScreenShot(String folder, String fileName)
    {
        TakesScreenshot screenshot=(TakesScreenshot)driver;
        File screenShotFile = screenshot.getScreenshotAs(OutputType.FILE);
        File imageFile=new File(folder+File.separator+fileName);
        try {
            FileUtils.copyFile(screenShotFile,imageFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
