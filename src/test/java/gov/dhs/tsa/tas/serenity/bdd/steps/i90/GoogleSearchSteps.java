//Steps Page

package gov.dhs.tsa.tas.serenity.bdd.steps.i90;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.dhs.tsa.tas.serenity.bdd.pages.elis.externalApp.GoogleSearch;

public class GoogleSearchSteps {
	
	//Create Variable
	
	GoogleSearch googleSearch;
	
	@Given("^the user wants to search in Google$")
	public void the_user_wants_to_search_in_Google() throws Throwable {
		googleSearch.open();
	}

	@When("^the user types \\\"([^\\\"]*)\\\" to search in Google$")
	public void the_user_types_something_to_search_in_Google(String value) throws Throwable {
		googleSearch.typeSearch(value);
	}

	@And("^the user clicks search$")
	public void the_user_clicks_search() throws Throwable {
		googleSearch.clickSearchBtn();
	}

	@Then("^the user sees the search results$")
	public void the_user_sees_the_search_results() throws Throwable {
		assertTrue(googleSearch.verifyTextBx().contains("something"));
	}
	

}
