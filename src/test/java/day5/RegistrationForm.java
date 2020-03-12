package day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserUtils;

import java.util.List;

public class RegistrationForm {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79.0").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/registration_form");
        BrowserUtils.wait(5);
        driver.findElement(By.name("firstname")).sendKeys("smith");
        driver.findElement(By.name("lastname")).sendKeys("smith");
        driver.findElement(By.name("username")).sendKeys("jsmith");
        driver.findElement(By.name("email")).sendKeys("juma.temory@gmail.com");
        driver.findElement(By.name("password")).sendKeys("*Case@255");
        driver.findElement(By.name("phone")).sendKeys("518-858-0090");
        List<WebElement> genders = driver.findElements(By.name("gender"));
        genders.get(1) .click();
        driver.findElement(By.name("birthday")).sendKeys("01/01/2007");
        driver.findElement(By.id("inlineCheckbox2"));
        driver.findElement(By.name("wooden_spoon")).click();
        BrowserUtils.wait(2);






driver.quit();

    }
}
