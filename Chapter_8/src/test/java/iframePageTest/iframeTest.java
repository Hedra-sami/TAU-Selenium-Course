package iframePageTest;
import Pages.EditorPage;
import org.testng.Assert;
import tests.java.open;
import org.testng.annotations.Test;

public class iframeTest extends open {
    @Test
    public void gettextofeditor(){
        EditorPage editorpage = homePage.gotoWYSeditorpage();

        editorpage.addtexttoeditor();
        editorpage.pressbutton();
        String text = editorpage.gettextofeditor();
        editorpage.returntomainframe();
        Assert.assertEquals(text,"HelloWorld");

    }
}
