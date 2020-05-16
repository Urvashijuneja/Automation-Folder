package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReorderPage {

        public ReorderPage (WebDriver driver)
        {
            PageFactory.initElements(driver,this) ;
        }

@FindBy(xpath="/html/body/div[1]/header/div/div[1]/div[4]/div[6]/div[2]/a/span")

        WebElement btnhomesignin;

        @FindBy(name = "email")
        WebElement email;

        @FindBy(id = "continue")
        WebElement btncontinue;

        @FindBy(name = "password")
        WebElement password;

        @FindBy(id = "signInSubmit")
        WebElement btnsignin;

        @FindBy(xpath = "/html/body/div[1]/header/div/div[2]/div[3]/div[2]/div/a[9]")
        WebElement menubuyagain;

    @FindBy(id = "searchOrdersInput")
    WebElement searchtext;


    @FindBy(xpath="/html/body/div[1]/div[2]/div/div[2]/div[2]/div/form/div[2]/span/span/input")
    WebElement btnsearchorders;

        @FindBy(id = "a-autoid-1-announce")
        WebElement btnbuyitagain;

        @FindBy(xpath = "/html/body/div[4]/div/div/div[1]/div/div/div/div[2]/div/div[6]/div[2]/form/div/span/span/input")
        WebElement btnaddtobasket;

        @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div/div[4]/div/div/div/span[2]/span/a")
        WebElement btnproceedtocheckout;


        public void clickbtnhomesignin()
        {
            btnhomesignin.click() ;
        }

        public void enteremail(String youremail)
        {
            email.sendKeys(youremail);
        }

        public void clickbtncontinue()
        {
            btncontinue.click() ;
        }

        public void enterpasswd(String pwd)
        {
            password.sendKeys(pwd);
        }

        public void clickbtnsignin()
        {
            btnsignin.click() ;
        }

        public void clickmenubuyagain()
        {
            menubuyagain.click();
        }

         public void entersearchtext(String searchtxt)
        {
            searchtext.sendKeys(searchtxt);
        }

        public void clickbtnsearchorders()
        {
            btnsearchorders.click() ;
        }
        public void clickbtnbuyitagain()
        {
            btnbuyitagain.click() ;
        }

        public void clickbtnaddtobasket()
        {
            btnaddtobasket.click() ;
        }

         public void clickbtnproceedtocheckout()
        {
            btnproceedtocheckout.click() ;
        }


    }



