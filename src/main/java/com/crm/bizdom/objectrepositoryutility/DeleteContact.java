package com.crm.bizdom.objectrepositoryutility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.bizdom.genericrepository.ExcelUtility;
import com.crm.bizdom.genericrepository.Fileutility;
import com.crm.bizdom.genericrepository.Javautility;
import com.crm.bizdom.genericrepository.WebdriverUtility;
import com.mysql.cj.jdbc.Driver;

public class DeleteContact {
	
//create contact
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastnameEdt;
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savecontactBtn;
	

	   //Delete contact
		@FindBy(xpath="(//input[@value='Delete'])[1]")
     private WebElement deletecontactBtn;
		
	
	public  DeleteContact(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	

	public void createcontact(){
				lastnameEdt.sendKeys("Santosha");
		savecontactBtn.click();
	}
	
			
		

			

			public WebElement getDeletecontactBtn() {
				return deletecontactBtn;
			}

            public void deletecontact(){
            	
            	
    			deletecontactBtn.click();
    			WebDriver driver = null;
				Alert a = driver.switchTo().alert();
    			a.accept();
    		
    			
            }
			
		

	}


