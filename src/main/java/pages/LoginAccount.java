package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAccount{
    private WebDriver driver;

    //Constructor
    public LoginAccount(WebDriver driver){ this.driver = driver;}

    //Method to perform login
    public void login(String username, String password){
        //Navigate to the login page
        driver.get("https://demoqa.com/login");
    //Find the username and password fields and the login button
        WebElement usernameField = driver.findElement(By.id("userName"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login\"]"));
    // Enter the username and password
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    //Click the login button
        loginButton.click();
    }
}