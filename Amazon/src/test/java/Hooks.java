import cucumber.api.java.After;
import cucumber.api.java.Before;
import functionLibrary.CommonFunctions;

public class Hooks {
    CommonFunctions cf = new CommonFunctions() ;

    @Before
    public void beforetest()
    {
        cf.OpenBrowser();
    }
    @After
    public void aftertest()
    {
        cf.closeBrowser() ;
    }
}
