package AppiumProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity2_1 {
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "AppiumClass");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);

        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
    }

    @Test
    public void toDoList()
    {
        driver.get("https://www.training-support.net/selenium");
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable + ".scrollForward(7).scrollIntoView(text(\"To-Do List\"))"))
                .click();
        driver.findElementById("taskInput").sendKeys("Add tasks to list");
        driver.findElementByXPath("//android.widget.Button[contains(@text, 'Add Task')]").click();
        driver.findElementById("taskInput").sendKeys("Get number of tasks");
        driver.findElementByXPath("//android.widget.Button[contains(@text, 'Add Task')]").click();
        driver.findElementById("taskInput").sendKeys("Clear the list");
        driver.findElementByXPath("//android.widget.Button[contains(@text, 'Add Task')]").click();

        driver.findElementByXPath("//android.view.View[contains(@text, 'Add tasks to list')]").click();
        driver.findElementByXPath("//android.view.View[contains(@text, 'Get number of tasks')]").click();
        driver.findElementByXPath("//android.view.View[contains(@text, 'Clear the list')]").click();

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]").click();

    }
    @AfterClass
    public void tearDown() {

        driver.quit();
    }
}
