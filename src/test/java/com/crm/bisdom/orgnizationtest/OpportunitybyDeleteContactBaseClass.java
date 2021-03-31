package com.crm.bisdom.orgnizationtest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.crm.bizdom.genericrepository.BaseClass;
import com.crm.bizdom.objectrepositoryutility.CreateOpportunitywithContactPage;
import com.crm.bizdom.objectrepositoryutility.CreateOpportunitywithOrgPage;
import com.crm.bizdom.objectrepositoryutility.DeleteOrganization;
import com.crm.bizdom.objectrepositoryutility.Home;
import com.crm.bizdom.objectrepositoryutility.OpportunityImgBtnPage;

public class OpportunitybyDeleteContactBaseClass extends BaseClass {
	
	@Test
	
public void deleteContact(String Prospective, String opportunityname, String Contacts, WebDriver driver2) throws Throwable{
		/*read test script data */ 
		String orgName2 = excelutil.readDatafromExcel("Sheet1", 1, 2)+javautil.generateRandomNum();
		String contact2 = excelutil.getDatafromExcel("Sheet1", "TC_01", "ContactName")+ javautil.generateRandomNum();
       String opportunityName2= excelutil.getDatafromExcel("Sheet1", "TC_01", "Opportunity Name")+javautil.generateRandomNum();
			

		 /*step 2 : navigate to to contacts*/ 
			//homepage
		 
			Home hp11=new Home(driver);
			hp11.getClickOpportunity();
			
		 //OpportunityImgBTn
			OpportunityImgBtnPage oip=new OpportunityImgBtnPage(driver);
			oip.Imgbtn();
			
			
		//Create Opportunity with contact
			CreateOpportunitywithContactPage coc=new CreateOpportunitywithContactPage(driver);
			coc.OpportunitywithContact(opportunityname, Contacts, Prospective);
			
		//Delete Contact
			DeleteContact dc=new DeleteContact(driver2);
			dc.contact();
			
			
			
			
			
}
}
