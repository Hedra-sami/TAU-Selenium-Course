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
    public HoverPage gotoHoverpage(){
        driver.findElement(By.linkText("Hovers")).click();
        return new HoverPage(driver);
    }
    public KeyPressPage gotoKeyPress(){
        driver.findElement(By.linkText("Key Presses")).click();
        return new KeyPressPage(driver);

    }
}
