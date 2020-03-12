package day6;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserUtils;

import java.util.List;

public class SelectByText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79.0").setup();
        ChromeDriver driver = new ChromeDriver();
        BrowserUtils.wait(3);
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select selectSimpleDropDown = new Select(dropdown);
        selectSimpleDropDown.selectByVisibleText("Option 2");
        BrowserUtils.wait(3);
        selectSimpleDropDown.selectByVisibleText("Option 1");
        BrowserUtils.wait(4);
        Select selectYear = new Select(driver.findElement(By.id("year")));
        Select selectMonth = new Select(driver.findElement(By.id("month")));
        Select selectDay = new Select(driver.findElement(By.id("day")));
       selectDay.selectByVisibleText("2");
      selectMonth.selectByVisibleText("March");
      selectYear.selectByVisibleText("2008");
        List<WebElement> months = selectMonth.getOptions();
        for (WebElement month: months){
            selectMonth.selectByVisibleText(month.getText());
            BrowserUtils.wait(1);
        }
        Select stateSelect = new Select(driver.findElement(By.id("state")));
        stateSelect.selectByVisibleText("District Of Columbia");
        String selected = stateSelect.getFirstSelectedOption().getText();
        if (selected.equals("District Of Columbia")){
            System.out.println("Test passed");
        } else {
            System.out.println("Test passed");
        }

        List<WebElement> allStates = stateSelect.getOptions();
        for (WebElement eachState: allStates){
            System.out.println(eachState.getText());
        }






        BrowserUtils.wait(3);
        driver.quit();
    }
}
