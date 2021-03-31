package com.crm.bisdom.orgnizationtest;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.bizdom.genericrepository.BaseClass;
import com.crm.bizdom.genericrepository.WebdriverUtility;
import com.crm.bizdom.objectrepositoryutility.ContactImg;
import com.crm.bizdom.objectrepositoryutility.CreateContactPage;
import com.crm.bizdom.objectrepositoryutility.CreateContactwithOrgPage;
import com.crm.bizdom.objectrepositoryutility.CreateOrganizationpage;
import com.crm.bizdom.objectrepositoryutility.Home;
import com.crm.bizdom.objectrepositoryutility.OrganizImg;


public class CreateContactusingBaseClass extends BaseClass {
	

	@Test(groups = "smokeTest")
	
	public void contactbase(Object String, String lastName) throws Throwable{
		/*read test script data */ 
		 String contactName = excelutil.readDatafromExcel("Sheet1", 1, 3)+ javautil.generateRandomNum();
		
		
		 /*step 2 : navigate to to contacts*/ 
		//homepage
		Home hp=new Home(driver);
		hp.getContactlnk().click();;
		
		//ContactImgBtnpage
		ContactImg ci=new ContactImg(driver);
		ci.Conim();
		
		//Create Contactpage
		CreateContactPage ccp=new CreateContactPage(driver);
		ccp.createcontact();
		
		 /*verify the contact in contact info Page*/
		  CreateContactPage cip = new CreateContactPage(driver);
		  String actContactNAme = cip.getSuccessMsg().getText();
		  boolean flag = actContactNAme.contains(contactName);		  		  
		  Assert.assertTrue(flag);  
	
		
		  


	
	}	

}
