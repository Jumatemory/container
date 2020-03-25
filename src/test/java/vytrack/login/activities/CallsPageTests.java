package vytrack.login.activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import utilities.BrowserUtils;
import utilities.DriverFactory;


public class CallsPageTests {
    private By usernameBy = By.id("prependedInput");
    private By passwordBy = By.id("prependedInput2");
    private WebDriver driver;
    private String storeManagerUserName = "storemanager85";
    private String storeManagerPassword = "UserUser123";
    private Actions actions;
    private By activities = By.xpath("//span[@class='title title title-level-1");

    @BeforeMethod
    public void setup(){
        driver = DriverFactory.createADriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();
        actions = new Actions(driver);

        BrowserUtils.wait(3);;
        driver.findElement(usernameBy) .sendKeys(storeManagerUserName);;
        driver.findElement(passwordBy).sendKeys(storeManagerPassword, Keys.ENTER    );
        BrowserUtils.wait(5);

    }

}
