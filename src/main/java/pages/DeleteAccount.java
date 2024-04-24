package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteAccount {
    private WebDriver driver;
    public DeleteAccount(WebDriver driver){
        this.driver = driver;}
    public void deleteAccount(){
        WebElement deleteAcc = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        deleteAcc.click();
    }
}