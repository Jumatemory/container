package day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserUtils;

import java.util.List;

public class NoSelectDropDown    {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79.0").setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);
        driver.findElement(By.id("dropdownMenuLink")).click();
        BrowserUtils.wait(2);
        driver.findElement(By.linkText("Google")).click();
        List<WebElement> allLinks = driver.findElements(By.className("dropdown-item"));

        for (WebElement eachLink :allLinks){
            System.out.println(eachLink.getText()+":"+ eachLink.getAttribute("href"));
        }






        BrowserUtils.wait(3);
        driver.quit();
    }
}
