package com.crm.bizdom.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactImg {
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createcontactBtn;
	

	/*blic ContactImg(WebDriver driver){
		PageFactory.initElements(driver, this);
	}*/


	public ContactImg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getCreatecontactBtn() {
		return createcontactBtn;
	}
	public void Conim(){
		createcontactBtn.click();
		
	}

}
