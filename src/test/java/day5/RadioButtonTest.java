package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserUtils;
import utilities.DriverFactory;

public class RadioButtonTest {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createADriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        BrowserUtils.wait(2);
        WebElement blackButton = driver.findElement(By.id("black"));
        if (blackButton.isDisplayed()&&blackButton.isEnabled()){
            blackButton.click();
        }
        blackButton.click();
        if (blackButton.isSelected()){
            System.out.println("TEST PASSED");
        } else {
            System.out.println("Test failed");
        }




        driver.quit();
    }
}
