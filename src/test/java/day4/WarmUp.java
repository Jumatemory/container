package day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUp {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().version("79.0").setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://ebay.com");
        WebElement element = driver.findElement(By.name("gh-ac"));
        element.sendKeys("term");
        element.click();
        System.out.println(element);
        Thread.sleep(2000);
        driver.quit();
    }
}
