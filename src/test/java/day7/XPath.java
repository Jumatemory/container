package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserUtils;
import utilities.DriverFactory;

public class XPath {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createADriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
        BrowserUtils.wait(3);
        driver.findElement(By.xpath("//label[text()='username']//following-sibling::input")).sendKeys("jumatemory");
        driver.findElement(By.xpath("//label[text()='password']/following-sibling::input")).sendKeys("SuperSecretPassword");







        BrowserUtils.wait(3);
        driver.quit();

    }
}
