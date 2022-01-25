package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        System.out.println("Title of the page: " +driver.getTitle());
        WebElement byID = driver.findElement(By.id("about-link"));
        System.out.println("Text of the webElement byID: "+byID.getText());
        WebElement byclassName = driver.findElement(By .className("green"));
        System.out.println("Text of the webElement byclassName: "+byclassName.getText());
        WebElement bylinkText = driver.findElement(By .linkText("About Us"));
        System.out.println("Text of the webElement bylinkText: "+bylinkText.getText());
        WebElement byCSS = driver.findElement(By .cssSelector(".green"));
        System.out.println("Text of the webElement byCSS: "+byCSS.getText());

        driver.close();
    }
}
