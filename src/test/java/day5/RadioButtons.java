package day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.BrowserUtils;

public class RadioButtons {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79.0").setup();
        ChromeDriver driver = new ChromeDriver();
        BrowserUtils.wait(3);



    }
}
