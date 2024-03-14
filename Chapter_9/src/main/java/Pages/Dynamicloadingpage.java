package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Dynamicloadingpage {
    private WebDriver driver;
    private By hiddenelement = By.linkText("Example 1: Element on page that is hidden");
    private By renderedelement = By.linkText("Example 2: Element rendered after the fact");
    private By startbutton = By.cssSelector("#start button");
    private By finish = By.id("finish");
    private By loading = By.cssSelector("#loading");
    public Dynamicloadingpage(WebDriver driver){
        this.driver = driver ;
    }
    public void example1(){
        driver.findElement(hiddenelement).click();
    }
    public void example2(){
        driver.findElement(renderedelement).click();
    }
    public void startexample1(){
        driver.findElement(startbutton).click();
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5) );
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
    }
    public String gettextofexample1(){
        return driver.findElement(finish).getText();
    }

}
