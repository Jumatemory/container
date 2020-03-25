package day8;

import Practice.BrowserFactory;
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

public class searchTest {
private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= BrowserFactory.getDriver("chrome");
        driver= new ChromeDriver();
    }

@Test
public void googleSearchTest(){
    driver.get("http://google.com");
    driver.manage().window().maximize();
  WebElement searchBox = driver.findElement(By.name("q"));
  searchBox.sendKeys("java", Keys.ENTER);
    BrowserUtils.wait(2);
   List<WebElement> javaLinks = driver.findElements(By.tagName("h3"));
   for (WebElement eachJavaLink: javaLinks){
       String var = eachJavaLink.getText();
       if (!var.isEmpty()){
           System.out.println(var);
           Assert.assertTrue(var.toLowerCase().contains("java"));
           System.out.println(var.toLowerCase() );
           System.out.println();
       }
   }
}
//@Test (description = "search for Java book on Amazon")
//public void amazonSearchTest(){
//        driver.get("http://amazon.com");
//        driver.manage().window().maximize();
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java");
//        BrowserUtils.wait(3);
//        driver.findElement(By.cssSelector("input[value=Go]")).click();
//       WebElement productTitle = driver.findElement(By.id("productTitle"));
//      productTitle.click();
//        BrowserUtils.wait(3);
//      String proTitle = driver.getTitle();
//    System.out.println(proTitle);
//       Assert.assertTrue(proTitle.toLowerCase().contains("java"));
//
//
//
    @Test



@AfterMethod
    public void teardown (){
        BrowserUtils.wait(5);
    driver.quit();
}
}
