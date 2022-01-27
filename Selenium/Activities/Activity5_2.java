package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page: " + driver.getTitle());
        WebElement checkbox = driver.findElement(By.name("toggled"));
        System.out.println("Is the checkbox selected: "+checkbox.isSelected());
        checkbox.click();
        System.out.println("Is the checkbox selected: "+checkbox.isSelected());
        driver.close();
    }
}
