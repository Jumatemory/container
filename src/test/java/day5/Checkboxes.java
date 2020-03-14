package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserUtils;

import java.util.List;

public class Checkboxes {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
        BrowserUtils.wait(4);

        List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));

        for (int i = 0; i < checkBoxes.size(); i++) {
                if (!checkBoxes.get(i).isSelected()&& checkBoxes.get(i).isDisplayed()&&checkBoxes.get(i).isEnabled()){
                    checkBoxes.get(i).click();
                    System.out.println(i+1+" checkbox was clicked");
                } else {
                    System.out.println(i+1+" checkbox was not clicked");
                }
        }

        BrowserUtils.wait(3);




        driver.quit();
    }
}
