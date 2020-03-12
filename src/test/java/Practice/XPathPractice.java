package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserUtils;

public class XPathPractice {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://ui.freecrm.com/");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("juma.temory@gmail.com");
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jumatemory");

        BrowserUtils.wait(3);








        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
        BrowserUtils.wait(2);
        driver.quit();
    }
}
