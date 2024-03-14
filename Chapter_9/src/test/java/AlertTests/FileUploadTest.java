package AlertTests;
import Pages.FileUploadPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.java.open;

public class FileUploadTest extends open{
    @Test
    public void getuploadedfile(){
        FileUploadPage fileupload = homePage.gotofileupload();
        fileupload.choosefile("H:\\resume\\_Course_Certificate_En.pdf");
        Assert.assertEquals(driver.findElement(By.id("uploaded-files")).getText(),"_Course_Certificate_En.pdf");
    }
}
