//Objects Page

package gov.dhs.tsa.tas.serenity.bdd.pages.elis.externalApp;

import gov.dhs.tsa.tas.serenity.bdd.pages.elis.ElisBasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com")
public class GoogleSearch extends ElisBasePage {
	
	/*
	 * Google Search Box
	 */
	@FindBy(id="lst-ib")
	private WebElementFacade searchBox;
	
	public void typeSearch(String value)	{
		searchBox.sendKeys(value);
	}
	
	/*
	 * Google Search button click
	 */
	@FindBy(className="lsb")
	private WebElementFacade searchBtn;
	
	public void clickSearchBtn()	{
		searchBtn.click();
	}
	
	/*
	 * User sees results
	 */
	@FindBy(id="lst-ib")
	private WebElementFacade verifyText;
	
	public String verifyTextBx()	{
		return verifyText.getTextValue();
	}


}
