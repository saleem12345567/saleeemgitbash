package com.crm.bisdom.orgnizationtest;

import org.testng.annotations.Test;

import com.crm.bizdom.genericrepository.BaseClass;
import com.crm.bizdom.objectrepositoryutility.CreateOpportunityPage;
import com.crm.bizdom.objectrepositoryutility.CreateOpportunitywithOrgPage;
import com.crm.bizdom.objectrepositoryutility.Home;
import com.crm.bizdom.objectrepositoryutility.OpportunityImgBtnPage;

import junit.framework.Assert;

public class CreateOpportunitywithOrgBase extends BaseClass {
	
	@Test(groups = "regressionTest")
		public void OpportunitybyOrg(String actualopportunityname1, String Organization1, String Prospective1, CharSequence opportunityname1) throws Throwable{
			
			/*read test script data */ 
			String orgName1 = excelutil.readDatafromExcel("Sheet1", 1, 2)+ javautil.generateRandomNum();
			String contac1 = excelutil.getDatafromExcel("Sheet1", "TC_01", "ContactName")+ javautil.generateRandomNum();
           String opportunityName11= excelutil.getDatafromExcel("Sheet1", "TC_01", "Opportunity Name")+javautil.generateRandomNum();
				

  		 /*step 2 : navigate to to contacts*/ 
  			//homepage
  		 
  			Home hp11=new Home(driver);
  			hp11.getClickOpportunity();
  			
  			
  		 //OpportunityImgPage
  				OpportunityImgBtnPage oib11=new OpportunityImgBtnPage(driver);
  				oib11.getCreateopportunityImgBtn();
  				
			//OpportunitywithOrg
  				CreateOpportunitywithOrgPage coo=new CreateOpportunitywithOrgPage(driver);
  				coo.OpportunitywithOrg(actualopportunityname1, Prospective1, Organization1);
  				
  				
  			
  				//Verify Opportunity
  				CreateOpportunityPage cop111=new  CreateOpportunityPage(driver);
  				String actualopportunityname11=cop111.getSuccessMsg1().getText();
  				boolean flag11=actualopportunityname11.contains(opportunityname1);
  				Assert.assertTrue(flag11);
  				
		}
		
		
	
	
}



