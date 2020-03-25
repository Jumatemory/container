package day11;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserUtils;

public class JSExecutor2 {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();


    }
    @Test
    public void verifyTitle(){
        String expected = "practice";
        JavascriptExecutor js = (JavascriptExecutor) driver;
       String actual = (String) js.executeScript("return document.title");
        Assert.assertEquals(actual,expected, "they are not equal");
    }
    @Test
    public void clickTest(){
        WebElement link =driver.findElement(By.linkText("Multiple buttons"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments(0).click",link);

    }

    @AfterMethod
    public void teardown(){
        BrowserUtils.wait(2);
        driver.quit();
    }


}
