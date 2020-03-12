package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsPracticeXPath {
    public static void main(String[] args) throws InterruptedException {
        BrowserFactory.getDriver("chrome");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
        WebElement dropDownLInk = driver.findElement(By.xpath("/html/body/div/div[2]/div/ul/li[11]/a"));
        System.out.println(dropDownLInk.getText() );
        dropDownLInk.click();
        Thread.sleep(3000);
        driver.close();

    }
}
