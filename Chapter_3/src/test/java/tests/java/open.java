package tests.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class open {

    private WebDriver driver;
    public void setup(){
        System.setProperty("webdriver.chrome.driver","H:\\courses\\iti testing\\untitled\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement Element1 = driver.findElement(By.linkText("Shifting Content"));
        Element1.click();
        WebElement Element2 = driver.findElement(By.linkText("Example 1: Menu Element"));
        Element2.click();
        List<WebElement> list=driver.findElements(By.tagName("li"));
        System.out.println("the number of elements ="+list.size());
        driver.quit();
    }
    public static void main(String[] args) {

open test = new open();
test.setup();

    }
}
