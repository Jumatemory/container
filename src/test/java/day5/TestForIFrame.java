package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserUtils;

public class TestForIFrame {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/nested_frames");
        BrowserUtils.wait(4);
        driver.switchTo().frame("mce_0_ifr");
        WebElement textInput = driver.findElement(By.id("tinymce"));
        System.out.println(textInput.getText());
        textInput.clear();
        textInput.sendKeys("hello,world");
        BrowserUtils.wait(3);
        driver.switchTo().defaultContent();
        WebElement heading = driver.findElement(By.tagName("h3"));
        System.out.println(heading.getText());






        BrowserUtils.wait(4);









        driver.quit();






    }
}
