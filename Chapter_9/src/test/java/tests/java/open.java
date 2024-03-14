package tests.java;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class open {

    public WebDriver driver;
protected HomePage homePage;

@BeforeClass
    public void setup(){

        System.setProperty("webdriver.chrome.driver","H:\\courses\\iti testing\\untitled\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);

    }
    @AfterMethod
    public void returntomain(){
        driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterClass
    public void exit(){
        driver.quit();
    }

}
