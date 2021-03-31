package com.crm.bisdom.orgnizationtest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.crm.bizdom.genericrepository.BaseClass;
import com.crm.bizdom.objectrepositoryutility.CreateOpportunityPage;
import com.crm.bizdom.objectrepositoryutility.CreateOpportunitywithContactPage;
import com.crm.bizdom.objectrepositoryutility.CreateOpportunitywithOrgPage;
import com.crm.bizdom.objectrepositoryutility.Home;
import com.crm.bizdom.objectrepositoryutility.OpportunityImgBtnPage;

import junit.framework.Assert;

public class CreateOpportunity extends BaseClass {
	@Test(groups="Smoke Test")
	
	public void opportunitybase(String Prospective, String opportunityname, CharSequence opportunity, String Contacts, String Organization, String Organization1, String Prospective1, CharSequence opportunityname1) throws Throwable{
		/*read test script data */ 
		 String opportunityName = excelutil.readDatafromExcel("Sheet1", 1, 4)+ javautil.generateRandomNum();
		 
		 /*step 2 : navigate to to contacts*/ 
			//homepage
		 
			Home hp=new Home(driver);
			hp.getClickOpportunity();
			
	 //OpportunityImgPage
			OpportunityImgBtnPage oib=new OpportunityImgBtnPage(driver);
			oib.getCreateopportunityImgBtn();
			
	//Create OpportunityPage
			CreateOpportunityPage cop=new CreateOpportunityPage(driver);
			cop.opportunity(opportunityname, Prospective);
			
	//Verify Opportunity
			CreateOpportunityPage cop1=new  CreateOpportunityPage(driver);
			String actualopportunityname=cop1.getSuccessMsg1().getText();
			boolean flag=actualopportunityname.contains(opportunityname);
			Assert.assertTrue(flag);
			
			
			
			
   				
   			
		
	}



}
