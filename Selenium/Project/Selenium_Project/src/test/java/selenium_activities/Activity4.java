package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void popularCourse()
    {
        WebElement course = driver.findElement(By.xpath("//h3[contains(text(),'Email Marketing Strategies')]"));

        System.out.println("Title of the second popular course is : " + course.getText());

        Assert.assertEquals("Email Marketing Strategies", course.getText());
    }

    @AfterMethod
    public void closeBrowser()
    {
        driver.close();
    }
}
