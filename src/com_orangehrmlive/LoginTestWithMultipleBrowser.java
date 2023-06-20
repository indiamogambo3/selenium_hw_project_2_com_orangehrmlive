package com_orangehrmlive;

/**
 * Project-2 - Project Name: com-orangehrmlive
 * BaseUrl = https://opensource-demo.orangehrmlive.com/
 * 1. Setup Edge browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class LoginTestWithMultipleBrowser {

    static String browser = "Edge";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        //If condition for launch for selected browser
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Invalid browser name!!");
        }

        //Open Url in browser
        driver.get(baseUrl);
        //Maximise browser
        driver.manage().window().maximize();
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Get title
        String getTitle = driver.getTitle();
        System.out.println("Page title is: " + getTitle);

        //Get current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is: " + currentUrl);

        //Get page source
        String pageSource = driver.getPageSource();
        System.out.println("Page source is: " + pageSource);

        //Find username field element
        WebElement findName = driver.findElement(By.name("username"));
        //Type username in username field
        findName.sendKeys("mukz123@gmail.co.uk");

        //Find password field element
        WebElement password = driver.findElement(By.name("password"));
        //Type password in password field
        password.sendKeys("Mogambo123");

        //close the driver
        //driver.close();
    }

}
