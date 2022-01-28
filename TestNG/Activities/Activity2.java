package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeMethod
    public void initialise()
    {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test
    public void testmethod1() {
        String title = driver.getTitle();
        System.out.println("Title of the page is: " + title);
        Assert.assertEquals(title, "Target Practice");
    }

    @Test
    public void testmethod2() {
        WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "black");
    }

    @Test(enabled = false)
    public void testmethod3() {
        String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }

    @Test
    public void testmethod4() {
        //This test will be skipped and will be be shown as skipped
        throw new SkipException("Skipping test case");
    }

    @AfterMethod
    public void close()
    {
        driver.close();
    }

}
