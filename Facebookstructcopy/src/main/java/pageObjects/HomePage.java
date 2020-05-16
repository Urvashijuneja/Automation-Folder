package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    public HomePage (WebDriver driver)
    {
        PageFactory.initElements(driver,this) ;
    }


    @FindBy(name = "firstname")
    WebElement firstname;

    @FindBy(name = "lastname")
    WebElement surname;

    @FindBy(name = "")
    WebElement passwd;

    @FindBy(name = "")
    WebElement mobno;

    @FindBy(name = "")
    WebElement dd;

    @FindBy(name = "")
    WebElement mm;

    @FindBy(name = "")
    WebElement yy;

    @FindBy(name = "")
    WebElement gender;

    @FindBy(id = "u_0_13")
    WebElement btnregister;

    public void enterfirstname(String firstnm)
    {
        firstname.sendKeys(firstnm);
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
}









