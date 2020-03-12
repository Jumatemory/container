package daydelete;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.DriverFactory;

public class WarmUp {
    static WebDriver driver;



    public static void main(String[] args) {
       ebayTest();
       amazonTest();
       wikiTest();



    }  public static void ebayTest() {
        driver = DriverFactory.createADriver("chrome");
        driver.get("http://ebay.com");
        driver.findElement(By.id("gh-ac")) .sendKeys("java book");
        driver.findElement(By.id("gh-btn")) .click();
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());

    }
    public static void amazonTest(){

    }
    public static void wikiTest(){

    }

}
