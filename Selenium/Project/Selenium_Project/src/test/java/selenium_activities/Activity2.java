package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void verifyHeading()
    {
        WebElement heading = driver.findElement(By.xpath("//h1[contains(text(),'Industry Experts')]"));

        System.out.println("Heading of the web page is : " + heading.getText());

        Assert.assertEquals("Learn from Industry Experts", heading.getText());
    }

    @AfterMethod
    public void closeBrowser()
    {
        driver.close();
    }
}
