package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsPracticeXPathPart2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver myDriver = BrowserFactory.getDriver("chrome");
        myDriver.get("http://practice.cybertekschool.com");
      WebElement element = myDriver.findElement(By.xpath("//span[@class='h1y']"));
        System.out.println(element.getText() );
        WebElement contextMenu = myDriver.findElement(By.xpath("//a[.='Context Menu']"));
        System.out.println(contextMenu.getText());

        Thread.sleep(4000);

    }
}
