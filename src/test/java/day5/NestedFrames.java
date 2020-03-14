package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserUtils;

public class NestedFrames {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/nested_frames");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        WebElement content = driver.findElement(By.id("content"));
        System.out.println(content.getText());


        BrowserUtils.wait(3);
        driver.quit();
    }
}
