package day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserUtils;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79.0").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        BrowserUtils.wait(5);
        List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));
        if (!checkBoxes.get(0).isSelected())
        checkBoxes.get(0).click();
        BrowserUtils.wait(2);

        for (int i = 0; i < checkBoxes.size(); i++) {
            if (checkBoxes.get(i).isDisplayed()&&checkBoxes.get(i).isEnabled()&&(!checkBoxes.get(i).isSelected() )){
                checkBoxes.get(1).click();
            } else {
                System.out.println(i+1+ " checkbox was not clicked ");
            }

        }



        BrowserUtils.wait(2);
        driver.quit();
    }
}
