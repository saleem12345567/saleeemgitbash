package com.crm.bisdom.orgnizationtest;

import org.testng.annotations.Test;

import com.crm.bizdom.genericrepository.BaseClass;
import com.crm.bizdom.objectrepositoryutility.CreateOpportunityPage;
import com.crm.bizdom.objectrepositoryutility.CreateOpportunitywithContactPage;
import com.crm.bizdom.objectrepositoryutility.Home;
import com.crm.bizdom.objectrepositoryutility.OpportunityImgBtnPage;

import junit.framework.Assert;

public class CreateOpportunitywithContactBase extends BaseClass {
	
	@Test(groups = "regressionTest")
	
	public void OpportunitywithContact(String Prospective, String Contacts, CharSequence opportunityname)throws Throwable {
		
		/*read test script data */ 
	String orgName = excelutil.readDatafromExcel("Sheet1", 1, 2)+ javautil.generateRandomNum();
	String contac = excelutil.getDatafromExcel("Sheet1", "TC_01", "ContactName")+ javautil.generateRandomNum();
    String opportunityName1= excelutil.getDatafromExcel("Sheet1", "TC_01", "Opportunity Name")+javautil.generateRandomNum();
		

	 /*step 2 : navigate to to contacts*/ 
		//homepage
	 
		Home hp1=new Home(driver);
		hp1.getClickOpportunity();
		
		
	 //OpportunityImgPage
			OpportunityImgBtnPage oib1=new OpportunityImgBtnPage(driver);
			oib1.getCreateopportunityImgBtn();
			
	//Create OpportunityPage
			CreateOpportunitywithContactPage coc1=new CreateOpportunitywithContactPage(driver);
			coc1.OpportunitywithContact(opportunityName1, Contacts, Prospective);
			
			
			//Verify Opportunity
			CreateOpportunityPage cop11=new  CreateOpportunityPage(driver);
			String actualopportunityname1=cop11.getSuccessMsg1().getText();
			boolean flag1=actualopportunityname1.contains(opportunityname);
			Assert.assertTrue(flag1);
			
	}
}
