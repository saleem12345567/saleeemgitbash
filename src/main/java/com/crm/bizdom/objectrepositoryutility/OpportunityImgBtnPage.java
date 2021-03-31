package com.crm.bizdom.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunityImgBtnPage {
	
	public OpportunityImgBtnPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createopportunityImgBtn;

	public WebElement getCreateopportunityImgBtn() {
		return createopportunityImgBtn;
		
	}
	public void Imgbtn(){
		createopportunityImgBtn.click();
	}

}
