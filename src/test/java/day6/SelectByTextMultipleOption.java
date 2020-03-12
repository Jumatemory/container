package day6;

import Practice.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserUtils;

import java.util.List;

public class SelectByTextMultipleOption {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);

        Select languagesSelect = new Select(driver.findElement(By.name("Languages")));
       boolean isMultiple =  languagesSelect.isMultiple();
        System.out.println(isMultiple);
        languagesSelect.selectByVisibleText("Java");
        languagesSelect.selectByVisibleText("JavaScript");
        languagesSelect.selectByVisibleText("Python");
        List<WebElement> allSelected = languagesSelect.getAllSelectedOptions();
        for (WebElement eachSelectLanguage: allSelected){
            System.out.println(eachSelectLanguage.getText());
        }



        BrowserUtils.wait(3);
        driver.quit();
    }
}
