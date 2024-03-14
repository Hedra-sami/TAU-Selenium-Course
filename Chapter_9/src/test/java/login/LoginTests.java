package login;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.securepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.annotations.Test;
import tests.java.open;


public class LoginTests extends open {
    @Test
    public void successfullogin(){

        LoginPage loginpage = homePage.clickForm();
        loginpage.sendusername("tomsmith");
        loginpage.sendpassword("SuperSecretPassword!");
        securepage secure= loginpage.successlogin();
        Assert.assertTrue(secure.gettext().contains("You logged into a secure area!"),"Alert text is correct");


    }
}
