package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserUtils;
import utilities.DriverFactory;

public class XPath {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createADriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        BrowserUtils.wait(3);
        WebElement btn1 = driver.findElement(By.
                xpath("//button[@onclick='button1()']"));
        btn1.click();
        WebElement btn2 = driver.findElement(By.
                xpath("//button[@onclick='button2()']"));
        btn2.click();

    }
}
