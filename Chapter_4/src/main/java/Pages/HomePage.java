package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    By formAuthentication = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public LoginPage clickForm(){
        driver.findElement(formAuthentication).click();
        return new LoginPage(driver);
    }
}
