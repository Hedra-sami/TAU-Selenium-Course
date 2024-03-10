package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSAlertPage {
    private WebDriver driver ;
    private By AlertButton = By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
    private By AlertCancel = By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button");
    private By resultfield = By.id("result");
    public JSAlertPage (WebDriver driver){
        this.driver = driver ;
    }
    public void clickonalertbutton(){
        WebElement JSbutton = driver.findElement(AlertButton);
        JSbutton.click();
    }
    public String clickoncancelalertbutton(){
        WebElement JSCancelbutton = driver.findElement(AlertCancel);
        JSCancelbutton.click();
        driver.switchTo().alert().dismiss();
        return getresultofalert();
    }
    public void AlertPage(){
        driver.switchTo().alert().accept();
    }
    public String getresultofalert(){
        return driver.findElement(resultfield).getText();
    }
}
