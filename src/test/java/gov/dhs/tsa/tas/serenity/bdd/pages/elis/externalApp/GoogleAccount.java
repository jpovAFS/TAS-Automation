//Objects Page

package gov.dhs.tsa.tas.serenity.bdd.pages.elis.externalApp;

import org.openqa.selenium.Keys;

import gov.dhs.tsa.tas.serenity.bdd.pages.elis.ElisBasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com")
public class GoogleAccount extends ElisBasePage {
	
	/*
	 * Find Google sign in button and click it
	 */
	
	@FindBy(id="gb_70")
	private WebElementFacade signInBtn;
	
	public void clickSignInBtn()	{
		signInBtn.click();
	}
	
	
	/*
	 * Find Create Account and click it
	 */
	
	@FindBy(className="daaWTb")
	private WebElementFacade createAccountBtn;
	
	public void clickCreateAccountBtn()	{
		createAccountBtn.click();
	}
	
	
	/*
	 * Find First name field and enter a name, 
	 */
	
	@FindBy(name="firstName")
	private WebElementFacade firstNameField;
	
	public void enterFirstName(String value)	{
		firstNameField.sendKeys(value, Keys.TAB);
	}
	
	
	/*
	 * Find Last name field and enter a name,
	 */
	
	@FindBy(name="lastName")
	private WebElementFacade lastNameField;
	
	public void enterLastName(String value)	{
		lastNameField.sendKeys(value, Keys.TAB);
	}
	
	
	/*
	 * Find username field and enter a username
	 */
	
	@FindBy(name="Username")
	private WebElementFacade userNameField;
	
	public void enterUsrName(String value)	{
		userNameField.sendKeys(value, Keys.TAB);
	}
	
	
	/*
	 * Check Heading of Create Google Account
	 */
	
	@FindBy(id="headingText")
	private WebElementFacade pageHeading;
	
	public String getRelatedText() {
		return pageHeading.getTextValue();
	}
	

}
