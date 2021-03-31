package com.crm.bisdom.orgnizationtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.bizdom.genericrepository.BaseClass;
import com.crm.bizdom.objectrepositoryutility.ContactImg;
import com.crm.bizdom.objectrepositoryutility.CreateContactPage;
import com.crm.bizdom.objectrepositoryutility.CreateContactwithOrgPage;
import com.crm.bizdom.objectrepositoryutility.Home;
import com.crm.bizdom.objectrepositoryutility.OrganizImg;

public class CreateContactwithOrgusingBaseClass extends BaseClass{
	  

		@Test(groups = "regressionTest")
	public void contactwithOrg(String lastName, String actContactNAme, CharSequence contactName)throws Throwable{
				
			 /*read test script data */ 
			 String orgName = excelutil.readDatafromExcel("Sheet1", 1, 2)+ javautil.generateRandomNum();
			 String contac = excelutil.getDatafromExcel("Sheet1", "TC_01", "ContactName")+ javautil.generateRandomNum();

			 /*step 2 : navigate to to contacts*/ 
			  Home hp1 = new Home(driver);
			  hp1.getOrglink().click();
			  
			  /*step 3 : navigate to to ORG*/ 
			  OrganizImg op = new OrganizImg(driver);
			  op.getCreateorg().click();
			  
			  /*step 3 : create Org*/
			  CreateOrganization cno = new CreateOrganization();
			  cno.creatOrganization(orgName, null, contac, contac);
			  //verify
			 CreateContactPage cop=new CreateContactPage(driver);
			  Assert.assertTrue(cop.getSuccessMsg().getText().contains(orgName));

			 /*step 4 : navigate to to contacts*/ 
			  hp1.getContactlnk().click();
			  
			 /*step 5 : navigate to create New Conatact Page*/
			  ContactImg cig=new ContactImg(driver);
			  cig.Conim();
			  
			 /*step 6 : create a Contact with Organization*/ 
			  CreateContactwithOrgPage ccop=new CreateContactwithOrgPage(driver);
			  ccop.createContact(lastName, orgName);
			  
			  /*verify the contact in contact info Page*/
			 CreateContactPage ccp1=new CreateContactPage(driver);
			  String actContactName = ccp1.getContactMsg().getText();
			  boolean flag1 = actContactNAme.contains(contactName);		  
			  Assert.assertTrue(flag1);

		}


	
	
}



