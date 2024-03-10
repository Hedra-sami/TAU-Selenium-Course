package AlertTests;
import Pages.JSAlertPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.java.open;
public class JSAlert extends open{

    @Test
    public void getresultofalert(){
        JSAlertPage Jsalert = homePage.gotoJSAlert();
        Jsalert.clickonalertbutton();
        Jsalert.AlertPage();
        Assert.assertEquals(Jsalert.getresultofalert(),"You successfully clicked an alert");

    }
    @Test
    public void clickoncancel(){
        JSAlertPage Jsalert = homePage.gotoJSAlert();
        Jsalert.clickoncancelalertbutton();
        Assert.assertEquals(Jsalert.clickoncancelalertbutton(),"You clicked: Cancel");
    }
}
