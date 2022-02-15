package Activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity1 {
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "AppiumClass");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.calculator");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
        caps.setCapability("noReset", true);

        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
    }

    @Test
    public void multiply()
    {
        driver.findElementById("com.google.android.calculator:id/digit_5").click();
        driver.findElementByAccessibilityId("multiply").click();
        driver.findElementById("com.google.android.calculator:id/digit_9").click();
        driver.findElementByXPath("//android.widget.Button[@content-desc=\"equals\"]").click();
        String result = driver.findElementById("com.google.android.calculator:id/result_final").getText();
        System.out.println("Multiplication result is: "+result);

        Assert.assertEquals(result, "45");
    }
    @AfterClass
    public void tearDown() {

        driver.quit();
    }
}
