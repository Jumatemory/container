package day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().version("79.0").setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        Thread.sleep(3000);
       List<WebElement> links =  driver.findElements(By.tagName("a"));
       for (WebElement link :links){
           System.out.println(link.getText());
           System.out.println(link.getAttribute("href"));
           System.out.println();

       }

        for (int i = 0; i < links.size(); i++) {
            links.get(1).click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.findElements(By.tagName("a"));

        }




        driver.quit();


    }
}
