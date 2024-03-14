package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class securepage {
    private WebDriver driver;
    By securealert = By.id("flash");
    public securepage(WebDriver driver){
        this.driver=driver;
    }
    public String gettext(){
        return driver.findElement(securealert).getText();
    }
}
