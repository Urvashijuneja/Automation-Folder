package facebookAuto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Loginclass {
    public void ValidateLogin()
    {
        //Opens a chrome browser
        WebDriverManager .chromedriver().setup() ;
        WebDriver driver = new ChromeDriver();

        // Opens a page
        driver.get("http://www.facebook.com");

        driver.findElement(By.name("email")).sendKeys("urvashi.punjabi@gmail.com");
        driver.findElement(By.name("pass") ).sendKeys("urj");
        driver.findElement(By.id("u_0_b")).click() ;

        String expectedMessage="Successful message";
        String actualMessage=driver.findElement(By.xpath("")).getText();
        Assert.assertEquals(expectedMessage,actualMessage);
        driver.quit();

    }

    public static void main(String[] args) {
        Loginclass testLogin = new Loginclass();
        testLogin.ValidateLogin();

    }
}
