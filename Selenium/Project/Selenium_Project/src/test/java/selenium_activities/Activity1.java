package selenium_activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void verifyTitle()
    {
        String title = driver.getTitle();

        System.out.println("Title of the page is : " + title);

        Assert.assertEquals("Alchemy LMS – An LMS Application", title);
    }

    @AfterMethod
    public void closeBrowser()
    {
        driver.close();
    }
}
