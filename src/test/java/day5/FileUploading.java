package day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserUtils;

public class FileUploading {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79.0").setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/upload");
        BrowserUtils.wait(4);
        WebElement upload = driver.findElement(By.id("file-upload"));
        String filePath = System.getProperty("user.dir")+ "/pom.xml";
        String filePath2 = "C:/Users/Temor/Desktop/AccessorAndMutators.pdf";
        upload.sendKeys(filePath2);
        driver.findElement(By.id("file-submit")).click();
        BrowserUtils.wait(5);


        driver.quit();
    }
}
