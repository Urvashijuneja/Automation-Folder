package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RegStepDefn extends CommonFunctions  {
    HomePage homepg= new HomePage(driver);

    @Given("^I am on home page \"([^\"]*)\"$")
    public void i_am_on_home_page(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
        driver.get(arg1);
        implicitWait(40);
    }
    @When("^I enter firstname \"([^\"]*)\"$")
    public void i_enter_firstname(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
        homepg.enterfirstname(arg1);
    }

    @When("^I enter surname \"([^\"]*)\"$")
    public void i_enter_surname(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
        homepg.enterlastname(arg1) ;
       // implicitWait(40);
    }

    @When("^I enter mobile number \"([^\"]*)\"$")
    public void i_enter_mobile_number(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
       // implicitWait(40);
        homepg.entermobno(arg1);
        implicitWait(40);
    }

    @When("^I enter password \"([^\"]*)\"$")
    public void i_enter_password(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
        homepg.enterpasswd(arg1) ;
    }

    @When("^I select date of birth$")
    public void i_select_date_of_birth()  {
        // Write code here that turns the phrase above into concrete actions
        homepg.enterdd("24");
        homepg.entermm(4);
        homepg.enteryy("1980");
    }

    @When("^I select gender$")
    public void i_select_gender() {
        // Write code here that turns the phrase above into concrete actions
        homepg.selectgender();
    }

    @Then("^I should able to successfully register$")
    public void i_should_able_to_successfully_register()  {
        // Write code here that turns the phrase above into concrete actions
        implicitWait(40);
        homepg.clickregister();
        implicitWait(40);
    }

    @Given("^I am on home page url$")
    public void homePage() throws FileNotFoundException , IOException
    {
        driver.get(readPropertyValue("url") );
    }

    @Then ("^I should register with \"([^\"]*)\"$")
    public void i_should_register_with_msg() {
        homepg.validateregistration();
    }

}
