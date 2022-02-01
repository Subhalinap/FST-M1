package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity8 {
    WebDriver driver;

    @BeforeClass
    public void openBrowser() {
        driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void contactUs()
    {
        driver.findElement(By.linkText("Contact")).click();
        WebElement name = driver.findElement(By .id("wpforms-8-field_0"));
        WebElement email = driver.findElement(By .id("wpforms-8-field_1"));
        WebElement subject = driver.findElement(By .id("wpforms-8-field_3"));
        WebElement msg = driver.findElement(By .id("wpforms-8-field_2"));
        name.sendKeys("Subhalina");
        email.sendKeys("subha@gmail.com");
        subject.sendKeys("Query");
        msg.sendKeys("Regarding course details");
        driver.findElement(By .id("wpforms-submit-8")).click();
        String successmsg = driver.findElement(By .xpath("//*[@id=\"wpforms-confirmation-8\"]/p")).getText();
        System.out.println("Success message after login: "+successmsg);

    }

    @AfterClass
    public void closeBrowser()
    {
        driver.close();
    }
}
