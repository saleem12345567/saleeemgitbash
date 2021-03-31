package com.crm.bisdom.orgnizationtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.bizdom.genericrepository.ExcelUtility;
import com.crm.bizdom.genericrepository.Fileutility;
import com.crm.bizdom.genericrepository.Javautility;
import com.crm.bizdom.genericrepository.WebdriverUtility;
import com.crm.bizdom.objectrepositoryutility.ContactImg;
import com.crm.bizdom.objectrepositoryutility.CreateContactwithOrgPage;
import com.crm.bizdom.objectrepositoryutility.Home;
import com.crm.bizdom.objectrepositoryutility.Login;

@Test
public class CreateContactwithOrg {
	static WebDriver driver;
	public void contact(String lastName, String orgName) throws Throwable{
		Fileutility fileutil =new Fileutility();
		Javautility javaUtil=new Javautility();
		ExcelUtility excel=new ExcelUtility();
		String brosweName=fileutil.getPropertykeyValue("browser");
		String url=fileutil.getPropertykeyValue("url");
		String username=fileutil.getPropertykeyValue("username");
		String password=fileutil.getPropertykeyValue("password");	
		String orgname=excel.getDatafromExcel("Sheet", "TC_01", "Organization Name")+javaUtil.generateRandomNum();
		
		if(brosweName.equals("chrome"))
		{
	      //WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(brosweName.equals("firefox"))
		{
	     // WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("provide valid browser");
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//navigate to Vtider
		driver.get(url);
		
		//LoginPage
			Login lp=new Login(driver);
			lp.loginToAPP(username,password);
			lp.getLoginBtn().click();
			
		//HomePage	
			Home hp=new Home(driver);
			hp.getContactlnk().click();
			
		//ContactImgPage	
			ContactImg ci=new ContactImg(driver);
			ci.getCreatecontactBtn().click();
			
		//CreateContactwithOrgPage	
			CreateContactwithOrgPage ccop=new CreateContactwithOrgPage(driver);
			ccop.createContact(lastName, orgname);
					
				

}
}
