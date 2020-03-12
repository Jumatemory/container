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
        BrowserUtils.wait(2);
    List<WebElement>radioButtons = driver.findElements(By.tagName("input"));
        for (WebElement radioButton:radioButtons){
            String id = radioButton.getAttribute("id");
            boolean isSelected = radioButton.isSelected();
            System.out.println(id+  " is selected   "+isSelected);
            if (radioButton.isEnabled()){
                radioButton.click();
                BrowserUtils.wait(1);
                System.out.println("Clicked on:: "+ id);
            } else {
                System.out.println("Button is disabled, not clicked::"+id);
            }

        }
        driver.quit();

    }
}
