import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.NewUser;

public class Test extends BaseTest {
    @org.testng.annotations.Test
    public void checkRegisterLoginPage(){
        NewUser newUser = new NewUser(driver);
        System.out.println(newUser.verifyNewUser());
        Assert.assertEquals(newUser.verifyNewUser(),"Automation TEST");
    }



}
