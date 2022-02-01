package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Activity7 {
    WebDriver driver;
    int count;

    @BeforeMethod
    public void openBrowser() {
        driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void courseCount()
    {
        driver.findElement(By.linkText("All Courses")).click();

        List<WebElement> courses = driver.findElements(By .linkText("See more..."));
        for (WebElement ccount:courses)
        {
            count++;
        }

        System.out.println("Number of courses: "+count);

    }

    @AfterMethod
    public void closeBrowser()
    {
        driver.close();
    }
}
