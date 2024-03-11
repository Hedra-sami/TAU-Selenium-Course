package Hover;
import Pages.HoverPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.java.open;
public class HoverTest extends open {
    @Test
    public void Hovertests(){
        HoverPage hoverpage = homePage.gotoHoverpage();
        HoverPage.figurecaption caption = hoverpage.HoverOverPage(1);
        Assert.assertEquals(caption.returnname(),"name: user1","Caption not displayed");
        Assert.assertTrue(caption.iscaptiondisplayed());
        Assert.assertEquals(caption.returnlink(),"View profile");

    }

}
