package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        System.out.println("Title of the page: " +driver.getTitle());
        driver.findElement(By.id("firstName")).sendKeys("Subhalina");
       // Thread.sleep(4000);
        driver.findElement(By.id("lastName")).sendKeys("Panda");
       // Thread.sleep(4000);
        driver.findElement(By.id("email")).sendKeys("subhalina.panda@ibm.com");
        driver.findElement(By.id("number")).sendKeys("9876543210");
        Thread.sleep(4000);
        driver.findElement(By .cssSelector(".ui.green.button")).click();
        Thread.sleep(4000);

       driver.close();
    }
}
