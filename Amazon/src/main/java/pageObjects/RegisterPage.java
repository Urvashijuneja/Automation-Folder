package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

        public RegisterPage (WebDriver driver)
        {
            PageFactory.initElements(driver,this) ;
        }

    @FindBy(xpath ="/html/body/div[1]/header/div/div[1]/div[4]/div[7]/div[2]/div/a")
   // @FindBy(//*[@id="nav-signin-tooltip"]/div/a")
    WebElement starthere;

    //String starthere=driver.findElement(By.xpath("\"/html/body/div[1]/header/div/div[1]/div[4]/div[7]/div[2]/div/a\"")).getText();

        @FindBy(name = "customerName")
        WebElement yourname;

        @FindBy(name = "email")
        WebElement email;
        @FindBy(name = "password")
        WebElement password;
        @FindBy(name = "passwordCheck")
        WebElement repassword;
        @FindBy(id = "continue")
        WebElement btnregister;


    public void clickstarthere()
    {starthere.click();
    }
        public void enteryourname(String yournm)
        {
            yourname.sendKeys(yournm);
        }
        public void enteremail(String youremail)
        {
            email.sendKeys(youremail);
        }

        public void enterpasswd(String pwd)
        {
            password.sendKeys(pwd);
        }
        public void reenterpasswd(String repwd)
        {
            repassword.sendKeys(repwd);
        }

        public void clickregister()
        {
            btnregister.click() ;
        }
    }


