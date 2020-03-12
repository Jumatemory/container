package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.DriverFactory;

public class FindElementPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverFactory.createADriver("chrome");

       driver.get("http://practice.cybertekschool.com/sign_up");
       WebElement element = driver.findElement(By.name("full_name"));
       Thread.sleep(1000);
       element.sendKeys("JumaTemory");

       WebElement element1 = driver.findElement(By.name("email"));
       element1.sendKeys("Juma.temory@gmail.com");
       Thread.sleep(5000);
       WebElement element2 = driver.findElement(By.name("wooden_spoon"));
       element2.click();
       Thread.sleep(3000);
       driver.quit();





    }
}
