package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HoverPage {
   private WebDriver driver ;
   By figure = By.className("figure");
   By figure_box = By.className("figcaption");
   public HoverPage(WebDriver driver){
       this.driver = driver;
   }
   public figurecaption HoverOverPage(int index){
       WebElement figurebox = driver.findElements(figure).get(index-1);
       Actions action = new Actions(driver);
       action.moveToElement(figurebox).perform();
       return new figurecaption(figurebox.findElement(figure_box));
   }
   public class figurecaption{
       private WebElement caption;
       private By name = By.tagName("h5");
       private By link = By.tagName("a");
       public figurecaption (WebElement caption){
           this.caption=caption;
       }
       public boolean iscaptiondisplayed(){
           return caption.isDisplayed();
       }
       public String returnname(){
           return caption.findElement(name).getText();
       }
       public String returnlink(){
           return caption.findElement(link).getText();
       }
   }
}
