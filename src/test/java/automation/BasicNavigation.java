package automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver();
        ChromeDriver driver = new ChromeDriver();
        driver.get("practice.cybertekschool.com");
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.close();
    }
}
