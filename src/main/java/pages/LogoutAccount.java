package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutAccount {
    private WebDriver driver;

    //Constructor
    public  LogoutAccount(WebDriver driver) {
        this.driver = driver;
    }

    //Method to perform the logout
    public void logout(){
        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        logoutButton.click();
    }

}