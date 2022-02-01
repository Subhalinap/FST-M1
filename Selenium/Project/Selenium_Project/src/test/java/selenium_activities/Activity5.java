package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void accountTitle()
    {
        driver.findElement(By.linkText("My Account")).click();

        String title = driver.getTitle();

        System.out.println("Title of the page after clicking on My account link is : " + title);

        Assert.assertEquals("My Account – Alchemy LMS", title);
    }

    @AfterMethod
    public void closeBrowser()
    {
        driver.close();
    }
}
