package automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingElementsByClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("number of links : " +allLinks.size());
        WebElement link = driver.findElement(By.linkText("Autocomplete"));
        link.click();

        Thread.sleep(3000);
        driver.navigate().back();
        WebElement partialLink = driver.findElement(By.partialLinkText("Drag"));
        partialLink.click();
        Thread.sleep(5000);


        driver.close();

    }
}
