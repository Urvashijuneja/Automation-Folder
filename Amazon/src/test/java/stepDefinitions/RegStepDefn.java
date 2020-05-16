package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.RegisterPage;

public class RegStepDefn extends CommonFunctions {
    RegisterPage regpg = new RegisterPage(driver);

    @Given("^I am on home page$")
    public void i_am_on_home_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://www.amazon.co.uk");
        regpg.clickstarthere();
    }

    @When("^I enter yourname \"([^\"]*)\"$")
    public void i_enter_yourname(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        regpg.enteryourname(arg1) ;
    }

    @When("^I enter email \"([^\"]*)\"$")
    public void i_enter_email(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        regpg.enteremail(arg1);

    }

    @When("^I enter password \"([^\"]*)\"$")
    public void i_enter_password(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        regpg.enterpasswd(arg1);

    }

    @When("^I reenter password \"([^\"]*)\"$")
    public void i_reenter_password(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        regpg.reenterpasswd(arg1);
    }

    @Then("^I should able to successfully register$")
    public void i_should_able_to_successfully_register() {
        // Write code here that turns the phrase above into concrete actions
        regpg.clickregister();
    }
}