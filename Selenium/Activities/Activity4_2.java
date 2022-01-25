package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println("Title of the page: "+driver.getTitle());
        driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Subhalina");
        // Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Panda");
        // Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("subhalina.panda@ibm.com");
        driver.findElement(By.xpath("//*[@id='number']")).sendKeys("9876543210");
        Thread.sleep(4000);
        driver.findElement(By .xpath("//input[contains(@class, 'green')]")).click();
        Thread.sleep(4000);

        driver.close();
    }
}
