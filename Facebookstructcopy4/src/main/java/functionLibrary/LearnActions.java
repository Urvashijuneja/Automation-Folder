package functionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");

        WebElement firstnameFld = driver.findElement(By.name("firstname"));
        WebElement lastnameFld = driver.findElement(By.name("lastname"));
        WebElement registerButton = driver.findElement(By.name("submit"));

        Actions actions = new Actions(driver);
        actions.moveToElement(firstnameFld)
               .keyDown(firstnameFld, Keys.TAB)
                .keyUp(lastnameFld,Keys.SHIFT).perform();


      //  actions.doubleClick(registerButton);
       // actions.moveToElement(registerButton).click().perform();

       /* JavascriptExecutor js = (JavascriptExecutor)driver;

        String currentUrl = js.executeScript("return document.URL").toString();
        String title = js.executeScript("return document.title").toString();
        js.executeScript("window.location='http://www.google.com'");

        js.executeScript("window.scrollBy(0,500)");

        String dateTestData = "06 may 2020";

        String clickMenu = "Prime Video";

        String subMenu = "";

        String expectedResult = "Login Successfully";

        WebElement homepageUnique = driver.findElement(By.xpath(""));

        String actualSuccessText = driver.findElement(By.xpath("")).getText();

        Assert.assertEquals(expectedResult, actualSuccessText);

        Assert.assertTrue(homepageUnique.isDisplayed());

        //
        //

        driver.findElement(By.xpath("//div[starts-with(@class, 'sb-date-field')]")).click();
        driver.findElement(By.xpath("//span[@aria-label='"+dateTestData+"']")).click();
        driver.findElement(By.xpath("//div[@id=\"hmenu-content\"]/ul/li/a/div[contains(text(), '"+clickMenu+"')]")).click();

        String actualText = driver.switchTo().alert().getText();

        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        driver.switchTo().alert().sendKeys("");

        String sourceWindow  = driver.getWindowHandle();

        //actions

        driver.switchTo().window(sourceWindow);*/
    }
}

