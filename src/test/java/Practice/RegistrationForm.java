package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.BrowserUtils;

public class RegistrationForm {
    private WebDriver driver;
    private String URL = "http://practice.cybertekschool.com/registration_form";
    private By firstNameBy = By.name("firstname");
    private By lastNameBy = By.name("lastname");
    private By usernameBy = By.name("username");
    private By emailBy = By.name("email");
    private By passwordBy = By.name("password");
    private By phoneBy = By.name("phone");
    private By maleBy = By.cssSelector("input[value='male']");
    private By femaleBy = By.cssSelector("input[value='other']");
    private By dateOfBirth = By.name("birthday");
    private By departmentBy = By.name("department");
    private By jobTitleBy = By.name("job_title");
    private By cPlusPlusBy = By.xpath("//label[text()='c++']/preceding-sibling::input");
    private By signUpBy = By.id("wooden_spoon");




    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().version("79.0").setup();
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

    }

    @Test
    public void test1(){
    driver.findElement(firstNameBy).sendKeys("Juma");
    driver.findElement(lastNameBy).sendKeys("Gul");
    driver.findElement(usernameBy).sendKeys("jumatemory");
    driver.findElement(emailBy).sendKeys("juma.temory@gmail.com");
    driver.findElement(passwordBy) .sendKeys("*Case#255");
    driver.findElement(phoneBy).sendKeys("5188580090");
    driver.findElement(maleBy).click();
    driver.findElement(dateOfBirth).sendKeys("05/05/1988");
        Select departmentSelect = new Select(driver.findElement(departmentBy));
        departmentSelect.selectByVisibleText("Department of Agriculture");
        Select jobTitleSelect = new Select(driver.findElement(jobTitleBy));
        jobTitleSelect.selectByVisibleText("SDET");





        
        BrowserUtils.wait(3);
    }


    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
