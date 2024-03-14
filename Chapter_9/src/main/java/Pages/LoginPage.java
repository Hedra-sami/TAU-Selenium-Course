package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    By username = By.id("username");
    By password = By.id("password");
    By loginButton = By.cssSelector("#login Button");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void sendusername(String Username){
        driver.findElement(username).sendKeys(Username);
    }
    public void sendpassword(String Password){
        driver.findElement(password).sendKeys(Password);

    }
    public securepage successlogin(){
        driver.findElement(loginButton).click();
        return new securepage(driver);
    }
}
