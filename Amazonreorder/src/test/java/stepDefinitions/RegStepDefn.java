package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.ReorderPage;

public class RegStepDefn extends CommonFunctions {

    ReorderPage  reorderpg = new ReorderPage(driver) ;

    @Given("^I am on home page$")
    public void i_am_on_home_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://www.amazon.co.uk");

    }

    @When("^I click on signin button on home page\"$")
    public void i_click_on_signin_button_on_home_page()  {
        // Write code here that turns the phrase above into concrete actions
        reorderpg.clickbtnhomesignin();
    }

    @When("^I enter email \"([^\"]*)\"$")
    public void i_enter_email(String arg1)
    {
        // Write code here that turns the phrase above into concrete actions
        reorderpg.enteremail(arg1) ;
    }

    @When("^I click on continue button$")
    public void i_click_on_continue_button() {
        // Write code here that turns the phrase above into concrete actions
       reorderpg.clickbtncontinue() ;
    }

    @When("^I enter password \"([^\"]*)\"$")
    public void i_enter_password(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
       reorderpg.enterpasswd(arg1) ;
    }

    @When("^I click signin button$")
    public void i_click_signin_button() {
        // Write code here that turns the phrase above into concrete actions
        reorderpg.clickbtnsignin() ;
    }

    @When("^I click buyagain menu$")
    public void i_click_buyagain_menu()  {
        // Write code here that turns the phrase above into concrete actions
        reorderpg.clickmenubuyagain() ;
    }

    @When("^I enter search text \"([^\"]*)\"$")
    public void i_enter_search_text(String arg1)  {
        // Write code here that turns the phrase above into concrete actions
        reorderpg.entersearchtext(arg1) ;
    }

    @When("^I click searchorders button$")
    public void i_click_searchorders_button() {
        // Write code here that turns the phrase above into concrete actions
        reorderpg.clickbtnsearchorders() ;
    }

    @When("^I click buyitagain   button$")
    public void i_click_buyitagain_button()  {
        // Write code here that turns the phrase above into concrete actions
        reorderpg.clickbtnbuyitagain() ;
    }

    @When("^I click addtobasket  buttton$")
    public void i_click_addtobasket_buttton()  {
        // Write code here that turns the phrase above into concrete actions
        reorderpg.clickbtnaddtobasket() ;
    }

    @When("^I click proceedtocheckout button$")
    public void i_click_proceedtocheckout_button()  {
        // Write code here that turns the phrase above into concrete actions
        reorderpg.clickbtnproceedtocheckout() ;
    }

    @Then("^I should able to successfully reorder$")
    public void i_should_able_to_successfully_reorder()  {
        // Write code here that turns the phrase above into concrete actions

    }

}
