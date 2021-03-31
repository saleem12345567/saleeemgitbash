package com.crm.bizdom.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement userNameEdt;
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordEdt;
	@FindBy(xpath="(//input[@value='Login'])[2]")
	private WebElement loginBtn;
	
	public Login(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public WebElement getUserNameEdt() {     
		return userNameEdt;
	}
	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void loginToAPP() {               
		userNameEdt.sendKeys("admin");
		passwordEdt.sendKeys("admin");
		loginBtn.click();
	}
	public void loginToAPP(String userName , String password) {
		userNameEdt.sendKeys(userName);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	}
	
			

}
