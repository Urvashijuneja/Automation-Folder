package functionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {
public static WebDriver driver;
public String valueForKey ;
    public String browser;

    public void OpenBrowser() throws Exception
    {

        browser = readPropertyValue("browser");

        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                Dimension dimension = new Dimension(1000, 1000);
                driver.manage().window().setSize(dimension);
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                Dimension dimension1 = new Dimension(420, 650);
                driver.manage().window().setSize(dimension1);
                break;

        }
    }
    public void closeBrowser()
    {
        driver.quit() ;
    }

    public String readPropertyValue(String key) throws FileNotFoundException, IOException
    {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\urvas\\IdeaProjects\\Facebookstructcopy2\\src\\main\\resources\\config.properties");


        Properties properties = new Properties();
        properties.load(inputStream);
        valueForKey= properties.getProperty(key);
        return valueForKey;

    }

    public void implicitWait(int waitime)
    {
        driver.manage().timeouts().implicitlyWait(waitime, TimeUnit.SECONDS);
    }

    public void explicitWait(WebElement element, int waittimeMax)
    {
        WebDriverWait wait = new WebDriverWait(driver, waittimeMax);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void splitDate()
    {
        String date = "24/11/1989";
        String[] splitDate = date.split("/");
        String day = splitDate[0];
        String month =splitDate[1];
        String year =splitDate[2];
    }
}
