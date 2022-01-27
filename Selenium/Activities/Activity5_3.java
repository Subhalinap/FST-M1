package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page: " + driver.getTitle());
        WebElement inputField = driver.findElement(By.id("dynamicText"));
        System.out.println("Is the input field enabled: "+inputField.isEnabled());
        driver.findElement(By .id("toggleInput")).click();
        System.out.println("Is the input field enabled: "+inputField.isEnabled());
        driver.close();
    }
}
