package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity9 {
    WebDriver driver;

    @BeforeClass
    public void openBrowser() {
        driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void completeLesson()
    {
        driver.findElement(By.linkText("All Courses")).click();
        driver.findElement(By .linkText("See more...")).click();
        driver.findElement(By .xpath("//a[contains(text(), 'Login to Enroll')]")).click();
        WebElement username = driver.findElement(By .id("user_login"));
        WebElement password = driver.findElement(By .id("user_pass"));
        username.sendKeys("root");
        password.sendKeys("pa$$w0rd");
        driver.findElement(By .id("wp-submit")).click();
        driver.findElement(By .xpath("//div[contains(text(), 'Investment & Marketing')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String title = driver.getTitle();
        System.out.println("Title of the current page is :"+title);
        Assert.assertEquals(title, "Investment & Marketing Final Strategies – Alchemy LMS");
        driver.findElement(By .xpath("//*[@id='learndash_post_87']/div/div[3]/div[2]/form/input[4]")).click();
    }

    @AfterClass
    public void closeBrowser()
    {
        driver.close();
    }
}
