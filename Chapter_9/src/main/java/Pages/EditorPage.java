package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditorPage {
    private WebDriver driver;
    private By editorfield = By.id("tinymce");
    private By button = By.cssSelector("#content > div > div > div.tox-editor-container > div.tox-editor-header > div.tox-toolbar-overlord > div > div:nth-child(5) > button:nth-child(2) > span > svg");
    public EditorPage(WebDriver driver){
        this.driver = driver ;
    }
    public void switchtoeditor(){
        driver.switchTo().frame("mce_0_ifr");

    }
    public void addtexttoeditor(){
        switchtoeditor();
        driver.findElement(editorfield).clear();
        driver.findElement(editorfield).sendKeys("Hello");
        returntomainframe();
    }
    public void pressbutton(){
        driver.findElement(button).click();
        switchtoeditor();
        driver.findElement(editorfield).sendKeys("World");
    }
    public String gettextofeditor(){
        return driver.findElement(editorfield).getText();
    }
    public void returntomainframe(){
        driver.switchTo().parentFrame();
    }
}
