package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

@RunWith(Cucumber.class)
public class StepDefination {

    @Given("^User has account in MI Application$")
    public void user_has_account_in_mi_application() throws Throwable{
        System.out.println("User has account in MI Application");
    }

    @When("^Going to flash sale$")
    public void going_to_flash_sale() throws Throwable{
        System.out.println("Going to flash sale");
    }

    @Then("^Mobile adds into the cart$")
    public void mobile_adds_into_the_cart() throws Throwable{
        System.out.println("Mobile adds into the cart");
    }

    @And("^Select the mobile \"([^\"]*)\"$")
    public void select_the_mobile_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }

    @And("^Add mobile into the cart$")
    public void add_mobile_into_the_cart() throws Throwable{
        System.out.println("Add mobile into the cart");
    }
    
    @Then("^Mobile adds into the cart&")
    public void Mobile_adds_into_the_cart() {
    	System.out.println("Mobile adds into the cart");
    }

    @And("^Gives the amount to pay$")
    public void gives_the_amount_to_pay() throws Throwable{
        System.out.println("Gives the amount to pay");
    }

}
