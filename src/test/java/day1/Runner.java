package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();


        driver.get("http://google.com");

        Thread.sleep(5000);

        driver.get("http://google.com");
       driver.manage().window().fullscreen();


      if (driver.getTitle().toLowerCase().contains("google")){
          System.out.println("test passed ");
      } else {
          System.out.println("Test failed");
      }
      driver.navigate().to("http://amazon.com");
      driver.navigate().back();
      verifyEquals(driver.getTitle(),"google");
        System.out.println(driver.getCurrentUrl());
      driver.close();


    }
    public static void verifyEquals(String arg1, String arg2){
        if (arg1.equalsIgnoreCase(arg2)){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

}
