package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
    private WebDriver driver;

    @BeforeMethod
    public void initialise()
    {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
    }

    @Test
    public void mainValidation()
    {
        System.out.println("Title of the page: "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Training Support");
        driver.findElement(By.id("about-link")).click();
        System.out.println("Title of the current page: "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }

    @AfterMethod
    public void close()
    {
        driver.close();
    }

}
