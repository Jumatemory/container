package day5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserUtils;

public class RadioButtonsTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        BrowserUtils.wait(2);
        WebElement blackButton = driver.findElement(By.id("green"));

        if (blackButton.isDisplayed()&&blackButton.isEnabled()){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }



        BrowserUtils.wait(2);
        driver.quit();


    }
}
