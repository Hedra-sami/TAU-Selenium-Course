package KeyPressPage;
import Pages.KeyPressPage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import tests.java.open;
import org.testng.annotations.Test;


public class KeyPressPageTest extends open {
    @Test
    public void Pagetest(){
        KeyPressPage page = homePage.gotoKeyPress();
        page.presskey("A"+ Keys.BACK_SPACE);
        Assert.assertEquals(page.getresult(),"You entered: BACK_SPACE","Message is not displayed");
    }

}
