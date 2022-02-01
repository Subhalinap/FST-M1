package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void verifyTitle()
    {
        WebElement title = driver.findElement(By.xpath("//h3[contains(text(),'Actionable Training')]"));

        System.out.println("Title of the first info box is : " + title.getText());

        Assert.assertEquals("Actionable Training", title.getText());
    }

    @AfterMethod
    public void closeBrowser()
    {
        driver.close();
    }

}
