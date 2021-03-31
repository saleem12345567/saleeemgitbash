package com.crm.bizdom.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.bizdom.genericrepository.WebdriverUtility;

public class CreateContactwithOrgPage extends WebdriverUtility {
	static WebDriver driver;
	
	

	@FindBy(name="lastname")
	private WebElement lastNameEdt ;
	
	//select Organization	
	@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[1]")
	private WebElement Orgselectbtn;
	
	//search for organisation
	@FindBy(xpath="//a[.='sapthagiri']")
	private WebElement clickOrgname;
	
	
	//save contact
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
    private WebElement savebtn;
	

	public CreateContactwithOrgPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}


	public WebElement getConname() {
		return lastNameEdt;
	}


	public WebElement getSelectbtn() {
		return Orgselectbtn;
	}


	public WebElement getOrgname() {
		return clickOrgname;
	}



	public WebElement getSavebtn() {
		return savebtn;
	}

	public void createContact(String lastName) {
		lastNameEdt.sendKeys(lastName);
		savebtn.click();
	}
	
	public void createContact(String lastName, String orgName){
		lastNameEdt.sendKeys(lastName);
		 Orgselectbtn.click();
		 swicthToWindow(driver,"index.php?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&fo" );
		 clickOrgname.click();
		 swicthToWindow(driver,"http://localhost:8888/index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing");
		 savebtn.click();
	
	
	
	
	

}

	
		
	


	
}
