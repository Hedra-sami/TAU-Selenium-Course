package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadPage {
    private WebDriver driver ;
    private By ChooseButton = By.id("file-upload");
    private By UploadButton = By.id("file-submit");
    public FileUploadPage(WebDriver driver){
        this.driver = driver ;
    }

    public void choosefile(String filepath){
        driver.findElement(ChooseButton).sendKeys(filepath);
        driver.findElement(UploadButton).click();
    }
}
