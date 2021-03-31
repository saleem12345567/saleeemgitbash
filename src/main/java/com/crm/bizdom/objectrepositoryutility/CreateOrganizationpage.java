package com.crm.bizdom.objectrepositoryutility;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.bizdom.genericrepository.ExcelUtility;
import com.crm.bizdom.genericrepository.Fileutility;
import com.crm.bizdom.genericrepository.Javautility;
import com.crm.bizdom.genericrepository.WebdriverUtility;

public class CreateOrganizationpage extends WebdriverUtility{
	WebDriver driver;
	
		//login
	
		
	
		@FindBy(xpath="//input[@name='accountname']")
		private WebElement orgnameEdt;
		@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
		private WebElement saveBtn;
		@FindBy(xpath="//span[@class='dvHeaderText']")
		private WebElement headertitle;
		@FindBy(xpath="//select[@name='industry']")
		private WebElement selectIndoptions;
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement saveorgindBtn;

		
		
		
		public CreateOrganizationpage(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
		


		public WebElement getOrgname() {
			return orgnameEdt;
		}

		public WebElement getSaveBtn() {
			return saveBtn;
		}
		public WebElement getorgtitle(){
			return headertitle;
		}
		public WebElement getindustrytype(){
			return selectIndoptions;
		}
	    public WebElement getindSaveBtn(){
			return saveorgindBtn;
			}

		

	    public void creatOrganization(String orgname , String industriesOption) throws Throwable {
			orgnameEdt.sendKeys(orgname);
			select(selectIndoptions, industriesOption);;
			saveBtn.click();
			 OrganizationInfo orginfo = new OrganizationInfo(driver);
			 waitforElement(orginfo.getSuccessFullMsg());
		}
		

}	

		

		

