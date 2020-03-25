package vytrack.login.fleet;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VehiclePageTests {
   private WebDriver driver;
    private String URL = "https://qa2.vytrack.com/";
    @BeforeMethod
    public void setup(){
       driver = new ChromeDriver();


    }
    @Test
    public void verifyPageSubTitle(){

    }

    @BeforeMethod
    public void teardown(){
        if (driver!=null){
            driver.quit();

        }
    }


}
