package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserUtils;

public class XPathPractice {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://ventfitness.com/join-plan/");
      WebElement firstName =  driver.findElement(By.xpath("//*[contains(@name, 'firstName')]"));
      firstName.sendKeys("Andrew");
      WebElement lastName = driver.findElement(By.xpath("//*[contains(@name,'lastName')]"));
      lastName.sendKeys("Pelton");
      WebElement city = driver.findElement(By.xpath("//*[contains(@name, 'city')]"));
      city.sendKeys("Troy");
      WebElement  dateOfBirth = driver.findElement(By.xpath("//*[contains(@name, 'birthday')]"));
      dateOfBirth.sendKeys("05/05/1977");

      WebElement email = driver.findElement(By.xpath("//input[@id='email_input']"))  ;
      email.sendKeys("Andrew.pelton@rensco.com");
      WebElement phoneNumber = driver.findElement(By.xpath("//*[contains(@name, 'cellPhone')]"));
      phoneNumber.sendKeys("5182704040");
      WebElement verifyEmail = driver.findElement(By.xpath("//*[contains(text(), 'Verify Email ')]"));
      verifyEmail.sendKeys("Andrew.pelton@rensco.com");
      WebElement nexStep = driver.findElement(By.xpath("//*[contains(text(),'next step')]"));
      nexStep.click();
      WebElement workPhone = driver.findElement(By.xpath("//input[@name='workPhone' or @class='err-msg']"));
      workPhone.sendKeys("518-270-4040");


        BrowserUtils.wait(5);
        driver.quit();
    }
}
