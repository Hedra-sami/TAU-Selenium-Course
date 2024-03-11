package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyPressPage {
    private WebDriver driver ;
    By field = By.id("target");
    By resultelement = By.id("result");
    public KeyPressPage(WebDriver driver){
        this.driver = driver;
    }

    public void presskey(String text){
        driver.findElement(field).sendKeys(text);
    }

    public String getresult(){

        String result = driver.findElement(resultelement).getText();
        return result;
    }
}
