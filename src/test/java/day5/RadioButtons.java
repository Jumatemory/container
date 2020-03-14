package day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserUtils;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79.0").setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        driver.manage().window().maximize();
        BrowserUtils.wait(3);
        List<WebElement> radioButtons = driver.findElements(By.tagName("input"));
        for (WebElement eachButton : radioButtons){
            String id = eachButton.getAttribute("id");
            if (eachButton.isEnabled()){


                eachButton.click();
                System.out.println(eachButton.isSelected());
                System.out.println("clicked on:: "+ eachButton.getAttribute("id"));
                BrowserUtils.wait(1);

            } else {
                System.out.println("Button is disabled, not clicked::"+id);
            }

        }




        BrowserUtils.wait(3);
        driver.quit();



    }
}
