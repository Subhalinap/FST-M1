package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("Title of the page: " + driver.getTitle());
        WebElement userName = driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
        userName.sendKeys("Subhalinap");
        WebElement password = driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
        password.sendKeys("Subha123");
        WebElement cpassword = driver.findElement(By .xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[3]/input"));
        cpassword.sendKeys("Subha123");
        WebElement email = driver.findElement(By.xpath("//input[contains(@class,'email')]"));
        email.sendKeys("subhalina@gmail.com");
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By .xpath("//*[@id='action-confirmation']"))));
        System.out.println(driver.findElement(By .xpath("//*[@id='action-confirmation']")).getText());

        driver.close();
    }
}
