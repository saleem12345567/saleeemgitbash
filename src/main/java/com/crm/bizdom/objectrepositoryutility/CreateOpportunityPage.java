package com.crm.bizdom.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.bizdom.genericrepository.WebdriverUtility;

public class CreateOpportunityPage extends WebdriverUtility {
@Test
	
	public CreateOpportunityPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='potentialname']")
	private WebElement nameTbox;
	
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
	

	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement successMsg;

	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveOpportunity;

	public WebElement getNameTbox() {
		return nameTbox;
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
	
	

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getSaveOpportunity() {
		return saveOpportunity;
	}
	
	public void opportunity(String opportunityname, String Prospective){
		nameTbox.sendKeys(opportunityname);
		userRadioBtn.click();
		closedate.click();
		select(selectSalesstage, Prospective);
		saveOpportunity.click();
	}
	

	public WebElement getSuccessMsg1() {
					return successMsg;
	}



}
