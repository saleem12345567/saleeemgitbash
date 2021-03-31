package com.crm.bizdom.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizImg {

	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createorg;
	
	
/*	public OrganizImg(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
*/

	


	public OrganizImg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}





	public WebElement getCreateorg() {
		return createorg;
	}
	public void ImgOrg(){
		createorg.click();
	}
}
