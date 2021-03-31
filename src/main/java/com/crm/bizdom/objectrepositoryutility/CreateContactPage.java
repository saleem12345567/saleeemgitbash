package com.crm.bizdom.objectrepositoryutility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.bizdom.genericrepository.ExcelUtility;
import com.crm.bizdom.genericrepository.Fileutility;
import com.crm.bizdom.genericrepository.Javautility;

public class CreateContactPage {
		
		//create contact
				
		
		@FindBy(xpath="//input[@name='lastname']")
		private WebElement lastnameEdt;
		@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
		private WebElement savecontactBtn;
		
		@FindBy(xpath = "//span[@class='dvHeaderText']")
		private WebElement successMsg;

		
		public  CreateContactPage(WebDriver driver){
			PageFactory.initElements(driver, this);
		}

		

		public WebElement getLastnameEdt() {
			return lastnameEdt;
			}
		
		
		public WebElement getSavecontactBtn() {
			return savecontactBtn;
		}

		
		public WebElement getContactMsg(){
			return successMsg;
		}
		





		public void createcontact(){
					lastnameEdt.sendKeys("Santosha");
			savecontactBtn.click();
		}



		public WebElement getSuccessMsg() {
						return successMsg;
		}



	
}

