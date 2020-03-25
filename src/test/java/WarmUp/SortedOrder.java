package WarmUp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserUtils;

import java.util.List;

public class SortedOrder {
    private WebDriver driver;

    @BeforeMethod
    public void setup (){
        WebDriverManager.chromedriver().version("79.0").setup();
        driver = new ChromeDriver();

    }
    @Test
    public void verifyTheTableIsSorted(){
        driver.get("http://practice.cybertekschool.com/tables");
        driver.manage().window().maximize();
        BrowserUtils.wait(3);
       WebElement firstHeader =  driver.findElement((By.xpath("//table[1]//*[text()='Last Name']")));
       firstHeader.click();
        List<WebElement> column = driver.findElements(By.xpath("//table[1]//tbody/td[1]"));
        for (int i = 0; i < column.size()-1; i++) {
                String value = column.get(i).getText();
                String nexValue = column.get(i+1).getText();
            Assert.assertTrue(value.compareTo(nexValue)<=0);
        }

    }

    @AfterMethod
    public void teardown(){
        BrowserUtils.wait(5);
        driver.quit();
    }

}
