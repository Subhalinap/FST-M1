package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/ajax");
        System.out.println("Title of the page: " + driver.getTitle());
        driver.findElement(By.xpath("//*[@id='ajax-content']/button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement msg = driver.findElement(By .xpath("//*[@id='ajax-content']"));
        wait.until(ExpectedConditions.textToBePresentInElement(msg, "HELLO!"));
        System.out.println("Content on the page after clicking button: "+msg.getText());
        //WebElement msg2 = driver.findElement(By .xpath("//*[@id='ajax-content']"));
        wait.until(ExpectedConditions.textToBePresentInElement(msg, "I'm late!"));
        System.out.println("Content on the page: "+msg.getText());
        driver.close();
    }
}
