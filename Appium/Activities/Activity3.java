package Activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {
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
    public void add()
    {
        driver.findElementById("com.google.android.calculator:id/digit_5").click();
        driver.findElementByAccessibilityId("plus").click();
        driver.findElementById("com.google.android.calculator:id/digit_9").click();
        driver.findElementByXPath("//android.widget.Button[@content-desc=\"equals\"]").click();
        String result = driver.findElementById("com.google.android.calculator:id/result_final").getText();
        System.out.println("Addition result is: "+result);

        Assert.assertEquals(result, "14");
    }

    @Test
    public void subtract()
    {
        driver.findElementById("com.google.android.calculator:id/digit_1").click();
        driver.findElementById("com.google.android.calculator:id/digit_0").click();
        driver.findElementByAccessibilityId("minus").click();
        driver.findElementById("com.google.android.calculator:id/digit_5").click();
        driver.findElementByXPath("//android.widget.Button[@content-desc=\"equals\"]").click();
        String result = driver.findElementById("com.google.android.calculator:id/result_final").getText();
        System.out.println("Subtraction result is: "+result);

        Assert.assertEquals(result, "5");
    }

    @Test
    public void multiply()
    {
        driver.findElementById("com.google.android.calculator:id/digit_5").click();
        driver.findElementByAccessibilityId("multiply").click();
        driver.findElementById("com.google.android.calculator:id/digit_1").click();
        driver.findElementById("com.google.android.calculator:id/digit_0").click();
        driver.findElementById("com.google.android.calculator:id/digit_0").click();
        driver.findElementByXPath("//android.widget.Button[@content-desc=\"equals\"]").click();
        String result = driver.findElementById("com.google.android.calculator:id/result_final").getText();
        System.out.println("Multiplication result is: "+result);

        Assert.assertEquals(result, "500");
    }

    @Test
    public void division()
    {
        driver.findElementById("com.google.android.calculator:id/digit_5").click();
        driver.findElementById("com.google.android.calculator:id/digit_0").click();
        driver.findElementByAccessibilityId("divide").click();
        driver.findElementById("com.google.android.calculator:id/digit_2").click();

        driver.findElementByXPath("//android.widget.Button[@content-desc=\"equals\"]").click();
        String result = driver.findElementById("com.google.android.calculator:id/result_final").getText();
        System.out.println("Division result is: "+result);

        Assert.assertEquals(result, "25");
    }

    @AfterClass
    public void tearDown() {

        driver.quit();
    }
}
