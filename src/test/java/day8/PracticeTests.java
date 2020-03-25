package day8;

import Practice.BrowserFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserUtils;

public class PracticeTests {
    private WebDriver driver;
    @BeforeMethod

    public void setup(){
       driver = BrowserFactory.getDriver("chrome");

        driver = new ChromeDriver();
    }
    @Test
    public void loginTest(){
        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();
        BrowserUtils.wait(4);
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
      driver.findElement(By.id("wooden_spoon")).click();
      BrowserUtils.wait(3);
     WebElement welcomeText = driver.findElement(By.cssSelector("//*[contains(text(),'Welcome to the Secure Area. When you are done click logout below.')]"));
        System.out.println(welcomeText  );
      WebElement compareText = driver.findElement(By.className("subheader"));
        System.out.println(compareText);
      compareText.getText();
        Assert.assertEquals(welcomeText,compareText,"The two text are not equal");






    }






    @AfterMethod
    public void teardown(){
        BrowserUtils.wait(3);
        driver.quit();
    }
}
