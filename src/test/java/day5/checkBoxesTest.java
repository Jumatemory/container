package day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserUtils;

import java.util.List;

public class checkBoxesTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79.0").setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        BrowserUtils.wait(5);
        List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));
        if (!checkBoxes.get(0).isSelected()&&checkBoxes.get(1).isSelected()){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        BrowserUtils.wait(2);
        WebElement checkBox1 = checkBoxes.get(0);
        checkBox1.click();
        BrowserUtils.wait(3);
        if (checkBox1.isSelected() ){
            System.out.println("Test passed::"  );
            System.out.println("checkBox#1 is selected::");
        } else {
            System.out.println("Test failed ");
        }
        driver.quit();

    }
}
