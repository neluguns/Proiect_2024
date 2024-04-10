package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewUser {
    private WebDriver driver;

    public NewUser(WebDriver driver){
        this.driver = driver;
    }
    public String verifyNewUser(){
        return driver.getTitle();
    }

    public void clickNewUser(){
        WebElement buttonNewUser = driver.findElement(By.xpath("//*[@id=\"newUser\"]"));
        buttonNewUser.click();
    }

    public void registerWithInformation(String firstName, String lastName, String userName, String password){
        WebElement firstName_locator = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
        WebElement lastName_locator = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
        WebElement userName_locator = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
        WebElement password_locator = driver.findElement(By.cssSelector("#password"));
        firstName_locator.sendKeys(firstName);
        lastName_locator.sendKeys(lastName);
        userName_locator.sendKeys(userName);
        password_locator.sendKeys(password);
    }

    public void clickCaptcha(){
        WebElement buttonClickCaptcha = driver.findElement(By.className("recaptcha-checkbox-border"));
        buttonClickCaptcha.click();
    }

    public void clickRegister(){
        WebElement buttonClickRegister = driver.findElement(By.xpath("//*[@id=\"register\"]"));
        buttonClickRegister.click();
    }



}
