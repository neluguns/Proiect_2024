import org.testng.Assert;
import pages.LoginAccount;
import pages.LogoutAccount;
import pages.NewUser;

public class Test extends BaseTest {
    @org.testng.annotations.Test
    public void checkRegisterLoginPage(){
        NewUser newUser = new NewUser(driver);
        System.out.println(newUser.verifyNewUser());
        Assert.assertEquals(newUser.verifyNewUser(),"DEMOQA");
    }

    @org.testng.annotations.Test
    public void RegisterAccount() throws InterruptedException {
        NewUser newUser = new NewUser(driver);
        newUser.clickNewUser();
        Thread.sleep(1000);
        newUser.registerWithInformation("Ioan","Arcalean","DemoTester","!IoanEBos_99");
        Thread.sleep(1000);
        newUser.clickCaptcha();
        Thread.sleep(5000);
        newUser.clickRegister();
    }

    @org.testng.annotations.Test
    public void LogIntoAccount() throws InterruptedException {
        LoginAccount loginAccount = new LoginAccount(driver);
        loginAccount.login("Mariella", "!IoanEBos_99"); //the .login section info
        System.out.println("Login successful!");
        Thread.sleep(2000);

    }


    @org.testng.annotations.Test
    public void LogOutFromAccount() throws InterruptedException {
        LogoutAccount logoutAccount = new LogoutAccount(driver);
        logoutAccount.logout;
        Thread.sleep(1000);
    }

    }


