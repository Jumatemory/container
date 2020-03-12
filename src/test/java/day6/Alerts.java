package day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserUtils;
import utilities.DriverFactory;

import java.util.List;

public class Alerts {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createADriver("chrome");
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        BrowserUtils.wait(3);
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        buttons.get(0).click();
        BrowserUtils.wait(3);
        String popUpText = driver.switchTo().alert().getText();
        System.out.println(popUpText);
        driver.switchTo().alert().accept();

        String expected = "You successfuly clicked an alert";
        String actual = driver.findElement(By.id("result")).getText();
        if (expected.equals(actual) ){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
            System.out.println("expected : "+ expected      );
            System.out.println("actual : "+ actual);
        }
        buttons.get(1).click();
        BrowserUtils.wait(3);
        driver.switchTo().alert().dismiss();



        buttons.get(2).click();
        BrowserUtils.wait(3);
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello, world");
        BrowserUtils.wait(5);
        alert.accept();
        String actual3 = driver.findElement(By.id("result")).getText();
        String expected3 = "Hello, world";

        if (actual3.endsWith(expected3)){
            System.out.println("Test passed");
        } else {
            System.out.println("Test passed");
            System.out.println("expected: " +expected3);
            System.out.println("actual "+ expected3);
        }








        BrowserUtils.wait(3);
        driver.quit();
    }
}
