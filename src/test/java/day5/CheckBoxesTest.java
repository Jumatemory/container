package day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserUtils;

import java.util.List;

public class CheckBoxesTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79.0").setup();;
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        List<WebElement> allBoxes = driver.findElements(By.tagName("input"));
        BrowserUtils.wait(3);
        System.out.println(!allBoxes.get(0).isSelected() && allBoxes.get(1).isSelected());



        BrowserUtils.wait(3);
        driver.quit();


    }
}
