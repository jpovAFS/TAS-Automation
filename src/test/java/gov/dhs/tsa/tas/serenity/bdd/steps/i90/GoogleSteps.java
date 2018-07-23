package gov.dhs.tsa.tas.serenity.bdd.steps.i90;

import java.text.SimpleDateFormat;
import java.util.Map;

import org.junit.Assert;

import com.gargoylesoftware.htmlunit.javascript.host.dom.DocumentType;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.dhs.tsa.tas.serenity.bdd.pages.elis.externalApp.GooglePage;
import net.serenitybdd.core.Serenity;

public class GoogleSteps {
	GooglePage googlePage;

	@Given("(?i)^the user goes to Google page$")
	public void theUserGoesToGooglePage() {
		//Serenity.setSessionVariable("driver").to(googlePage.getDriver());
		googlePage.open();
	}
	
	@When("(?i)^the user enters \"([^\"]*)\" in search field$")
	public void theUserEntersXInSearchField(String searchText) {
		googlePage.searchFor(searchText);
	}
	
	@Then("(?i)^the user clicks the link$")
	public void theUserClicksTheLink() {
		googlePage.clickSerenityLink();
	}
}
	