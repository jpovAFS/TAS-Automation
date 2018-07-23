//Steps Page

package gov.dhs.tsa.tas.serenity.bdd.steps.i90;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.dhs.tsa.tas.serenity.bdd.pages.elis.externalApp.SignIn;
import static org.junit.Assert.*;

public class GoogleSignInSteps {
	
	//create a variable for the Page project
	SignIn signInPage;

	@Given("^the user wants to log into Google$")
	public void the_user_wants_to_log_into_Google()	{
	    signInPage.open();
	}
	
	@When("^the user clicks on Sign In Button$")
	public void the_user_clicks_on_Sign_In_Button()	{
		signInPage.clickSignInBtn();
	    
	}
	
	@And("(?i)^the user enters \\\"([^\\\"]*)\\\" User Name$")
	public void the_user_enters_User_Name(String usrName)	{
		signInPage.enterUserName(usrName);
	} //(?i)^the user enters \"([^\"]*)\ User Name$
	
	
	@Then("^the user sees the error$")
	public void the_user_sees_the_error()	{
	    //assertTrue(element(By.cssSelector('[class="dEOOab RxsGPe"]')).containsText("Couldn't find your Google Account"));
	    assertTrue(signInPage.getRelatedText().contains("Couldn't find your Google Account"));
	}
	

}
