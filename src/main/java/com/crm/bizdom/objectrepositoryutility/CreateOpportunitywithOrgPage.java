package com.crm.bizdom.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.bizdom.genericrepository.WebdriverUtility;

public class CreateOpportunitywithOrgPage extends WebdriverUtility {
@Test
	
	public CreateOpportunitywithOrgPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='potentialname']")
	private WebElement nameTbox;

	@FindBy(xpath="//select[@id='related_to_type']")
	private WebElement selectRelatedType;

	@FindBy(xpath="//input[@value='U']")
	private WebElement userRadioBtn;

	@FindBy(xpath = "//img[@id='jscal_trigger_closingdate']")
	private WebElement closedate;

	@FindBy(xpath = "//td[@class='button nav' and .='Â«']")
	private WebElement selectyear;

	@FindBy(xpath = "(//td[@class='button nav' and .='â€¹'])[1]")
	private WebElement selectmonth;

	@FindBy(xpath="//td[.='9']")
	private WebElement date;



	@FindBy(xpath="//select[@name='sales_stage']")
	private WebElement selectSalesstage;

	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveOpportunity;



	public WebElement getNameTbox() {
		return nameTbox;
		
	}

	public WebElement getSelectRelatedType() {
		return selectRelatedType;
	}


	public WebElement getUserRadioBtn() {
		return userRadioBtn;
	}



	public WebElement getClosedate() {
		return closedate;
	}

	public WebElement getSelectyear() {
		return selectyear;
	}

	public WebElement getSelectmonth() {
		return selectmonth;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getSelectSalesstage() {
		return selectSalesstage;
	}


	public WebElement getSaveOpportunity() {
		return saveOpportunity;
	}

public void OpportunitywithOrg(String opportunityname,  String Prospective, String Organization){
	nameTbox.sendKeys(opportunityname);
	select(selectRelatedType, Organization);
	userRadioBtn.click();
	closedate.click();
	select(selectSalesstage, Prospective);
	saveOpportunity.click();
	
	

	
}
}
