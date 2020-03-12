package day6;

import Practice.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserUtils;

public class SelectByValue {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);
        Select statSelect = new Select(driver.findElement(By.id("state")));
        statSelect.selectByValue("DC");
        String expected = "District Of Columbia";
        String actual = statSelect.getFirstSelectedOption().getText();
        if (expected.equals(actual)){
            System.out.println("Test passed ");
        } else {
            System.out.println("Test failed");
        }







        BrowserUtils.wait(3);
        driver.quit();
    }
}
