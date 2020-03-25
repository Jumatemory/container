package day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserUtils;

import java.util.List;

public class PasswordReset {

    private WebDriver driver;
    @BeforeMethod

    public void setup(){

        WebDriverManager.chromedriver().version("79.9").setup();
        driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");


    }
    @Test

    public void resetPassword(){
        driver.findElement(By.linkText("forgot_password")).click();
        driver.findElement(By.name("email")).sendKeys("juma.temory@gmail.com", Keys.ENTER);
        BrowserUtils.wait(3);
        String actual = driver.findElement(By.name("confirmation_message")).getText();
        String expected ="you e-mail's has been sent";
        Assert.assertEquals(actual,expected);
    }







    public void teardown(){
        driver.quit();
        BrowserUtils.wait(3);
    }
}
