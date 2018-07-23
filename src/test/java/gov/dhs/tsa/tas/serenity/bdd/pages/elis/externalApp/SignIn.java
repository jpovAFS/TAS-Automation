//Object Page
//elements

package gov.dhs.tsa.tas.serenity.bdd.pages.elis.externalApp;

import org.openqa.selenium.Keys;

import gov.dhs.tsa.tas.serenity.bdd.pages.elis.ElisBasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com")
public class SignIn extends ElisBasePage {
	
	//sign in button
	@FindBy(id="gb_70")
	private WebElementFacade signInBtn;
		
	public void clickSignInBtn()	{
		signInBtn.isCurrentlyVisible();
		signInBtn.click();
	}

	
	//enters user name
	@FindBy(id="identifierId")
	private WebElementFacade typeUserName;
	
	public void enterUserName(String value)	{
		typeUserName.sendKeys(value, Keys.ENTER);
	}
	
	
	//looks for the error message
	@FindBy(className="LXRPh")
	private WebElementFacade errorMsg;
	
	public String getRelatedText() {
		return errorMsg.getTextValue();
	}

	
}
