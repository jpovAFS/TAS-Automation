//Steps Page

package gov.dhs.tsa.tas.serenity.bdd.steps.i90;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.dhs.tsa.tas.serenity.bdd.pages.elis.externalApp.GoogleAccount;

public class GoogleAccountSteps {

	//Create Variable
	GoogleAccount googleAccount;
	
	@Given("^the user wants to create a Google Account$")
	public void the_user_wants_to_create_a_Google_Account() throws Throwable {
	    googleAccount.open();
	}

	@When("^the user clicks on the Sign In button$")
	public void the_user_clicks_on_the_Sign_In_button() throws Throwable {
	   googleAccount.clickSignInBtn();
	}

	@And("^the user clicks on the Create Account Button$")
	public void the_user_clicks_on_the_Create_Account_Button() throws Throwable {
	   googleAccount.clickCreateAccountBtn();
	}

	@And("^the user enters the \\\"([^\\\"]*)\\\" First Name$")
	public void the_user_enters_the_First_Name(String value) throws Throwable {
	   googleAccount.enterFirstName(value);
	}

	@And("^the user enters the \\\"([^\\\"]*)\\\" Last Name$")
	public void the_user_enters_the_Last_Name(String value) throws Throwable {
	   googleAccount.enterLastName(value);
	}

	@And("^the user enters the \\\"([^\\\"]*)\\\" UserName$")
	public void the_user_enters_the_UserName(String value) throws Throwable {
	    googleAccount.enterUsrName(value);
	}

	@Then("^the user sees the Page Heading$")
	public void the_user_sees_the_Page_Heading() throws Throwable {
		assertTrue(googleAccount.getRelatedText().contains("Create your Google Account"));
	}
	
}
