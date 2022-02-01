package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity6 {
    WebDriver driver;

    @BeforeClass
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

    @Test
    public void login()
    {
        driver.findElement(By .xpath("//*[@id='uagb-column-e9d225cb-cee9-4e02-a12d-073d5f051e91']/div[2]/div[2]/a")).click();
        WebElement username = driver.findElement(By .id("user_login"));
        WebElement password = driver.findElement(By .id("user_pass"));
        username.sendKeys("root");
        password.sendKeys("pa$$w0rd");
        driver.findElement(By .id("wp-submit")).click();
        WebElement logoutButton = driver.findElement(By .xpath("//*[@id='uagb-column-e9d225cb-cee9-4e02-a12d-073d5f051e91']/div[2]/div[4]/a"));
        Assert.assertTrue(logoutButton.isDisplayed());
    }

    @AfterClass
    public void closeBrowser()
    {
        driver.close();
    }
}
