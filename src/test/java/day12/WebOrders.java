package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.DriverFactory;

import java.util.List;

public class WebOrders {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= DriverFactory.createADriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders");


    }
    @Test
    public void checkboxTest(){
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test", Keys.ENTER);
        driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();
        BrowserUtils.wait(3);
        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[type='checkbox"));
        for (WebElement checkbox : checkBoxes){
            Assert.assertTrue(checkbox.isSelected());
        }

    }
    @Test
    public  void updateZipCode(){
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test", Keys.ENTER);

        BrowserUtils.wait(3);
        WebElement zipCode = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tbody//tr[4]//td[9]"));
        String expected =zipCode.getText();
                Assert.assertEquals(    expected ,"21233");
    }



    @AfterMethod
    public void teardown(){
        BrowserUtils.wait(4);
        driver.quit();
    }
}
