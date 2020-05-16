import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",dryRun =false ,strict = true,
        plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/testReport/tsr.html"} )

public class TestRunner {
    @AfterClass

    public static void generateReport()
    {
        Reporter.loadXMLConfig("C:\\Users\\urvas\\IdeaProjects\\Facebookstructcopy\\src\\main\\resources\\extent-config.xml");


    }

}
