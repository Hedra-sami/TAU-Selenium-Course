package waittests;
import Pages.Dynamicloadingpage;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.java.open;
public class example1 extends open{
    @Test
    public void example1text(){
        Dynamicloadingpage page = homePage.gotoloadingpage();
        page.example1();
        page.startexample1();
        Assert.assertEquals(page.gettextofexample1(),"Hello World!");
    }
}
