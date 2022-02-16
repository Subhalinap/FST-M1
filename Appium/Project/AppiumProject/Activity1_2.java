package AppiumProject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity1_2 {
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "AppiumClass");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
    }

    @Test
    public void createNewNote()
    {
        driver.findElementByAccessibilityId("New text note").click();
        driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("New note");
        driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("Hello there !");
        driver.findElementByAccessibilityId("Open navigation drawer").click();

        Assert.assertTrue(driver.findElementById("com.google.android.keep:id/browse_note_interior_content").isDisplayed());
    }

    @AfterClass
    public void tearDown() {

        driver.quit();
    }
}
