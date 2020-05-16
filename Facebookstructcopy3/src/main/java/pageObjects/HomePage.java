package pageObjects;

import functionLibrary.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HomePage {

    public String firstnameValue;

    public HomePage (WebDriver driver)
    {
        PageFactory.initElements(driver,this) ;
    }


    CommonFunctions commonFunctions = new CommonFunctions();
    @FindBy(name = "firstname")
    WebElement firstname;

    @FindBy(name = "lastname")
    WebElement surname;

    @FindBy(name = "reg_email__")
    WebElement mobno;

    @FindBy(name = "reg_passwd__")
    WebElement passwd;



    @FindBy(name = "birthday_day")
    WebElement dd;

    @FindBy(name = "birthday_month")
    WebElement mm;

    @FindBy(name = "birthday_year")
    WebElement yy;

    @FindBy(name = "sex")
    WebElement gender;

    @FindBy(id = "u_0_13")
    WebElement btnregister;

  //  public void enterfirstname(String firstnm)
   // {
     //   firstname.sendKeys(firstnm);
    //}

    public void enterfirstname(String firstnm) throws ClassNotFoundException ,SQLException
    {

        ResultSet rs = commonFunctions.testDataFromDB("select firstname from registrationtestdata") ;
        while(rs.next())
        {
            firstnameValue  = rs.getString(1);

        }
        firstname.sendKeys(firstnameValue);

    }


    public void enterlastname(String lastnm)
    {
        surname.sendKeys(lastnm);
    }
    public void entermobno(String mobileno)
    {
        mobno.sendKeys(mobileno);
    }

    public void enterpasswd(String pwd)
    {
        commonFunctions.explicitWait(passwd, 5);
        passwd.sendKeys(pwd);
    }
    public void enterdd(String day)
    {
     new Select(dd).selectByVisibleText(day);
    }
    public void entermm(int mon)
    {
        new Select(mm).selectByIndex(mon) ;
    }
    public void enteryy(String year)
    {
        new Select(yy).selectByValue(year) ;
    }
    public void selectgender()
    {
        gender.click() ;
    }
    public void clickregister()
    {
        btnregister.click() ;
    }
    public void validateregistration() {};
}









