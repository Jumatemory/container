package day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserUtils;

import java.util.List;

public class SearchTest {
    private WebDriver driver;


    @Test
    public void googleSearchTest(){
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("java", Keys.ENTER    );
        BrowserUtils.wait(2);
        List<WebElement> searchItems = driver.findElements(By.tagName("h3"));
        for (WebElement searchItem : searchItems){

            String var = searchItem.getText();
            if (!var.isEmpty()){
                System.out.println(var);
                Assert.assertTrue(var.toLowerCase().contains("java"));
            }


        }
    }
    @BeforeMethod
    public void setup(){

        WebDriverManager.chromedriver().version("79.0").setup();
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }

    @Test(description = "Search for Java book on amazon ")
    public void amazonSearchTest(){
        driver.get("http://amazon.com");


    }


}
