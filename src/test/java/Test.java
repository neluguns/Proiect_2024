
import pages.DeleteAccount;
import pages.LoginAccount;
import pages.LogoutAccount;

public class Test extends BaseTest {

    @org.testng.annotations.Test //This is a test for the login function on the website
    public void LogIntoAccount() throws InterruptedException {
        LoginAccount loginAccount = new LoginAccount(driver);
        loginAccount.login("Mariella", "!IoanEBos_99"); //the .login section info for a created account
        System.out.println("Login successful!");
        Thread.sleep(5000);
        //Test works with no issues until here
    }

    @org.testng.annotations.Test //This is a test for the logout function from the website
    public void LogOutFromAccount() throws InterruptedException {
        LoginAccount loginAccount = new LoginAccount(driver);
        loginAccount.login("Mariella", "!IoanEBos_99");
        //the .login section info for a created account
        System.out.println("Login successful!");
        Thread.sleep(5000);
        LogoutAccount logoutAccount = new LogoutAccount(driver);
        logoutAccount.logout();
        System.out.println("Logout successful!");
        Thread.sleep(1000);
        //Test works with no issues until here
    }

    @org.testng.annotations.Test
    public void DeleteAccount() throws InterruptedException {
        LoginAccount loginAccount = new LoginAccount(driver);
        loginAccount.login("Mariella", "!IoanEBos_99");
        //the .login section info for an already created account
        System.out.println("Account deleted successfully!");
        Thread.sleep(5000);
        DeleteAccount deleteAccount = new DeleteAccount(driver);
        deleteAccount.deleteAccount();
        Thread.sleep(2000);
        //Test works with no issues until here
    }
    }