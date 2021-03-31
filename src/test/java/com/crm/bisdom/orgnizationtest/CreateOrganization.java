package com.crm.bisdom.orgnizationtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.bizdom.genericrepository.ExcelUtility;
import com.crm.bizdom.genericrepository.Fileutility;
import com.crm.bizdom.genericrepository.Javautility;
import com.crm.bizdom.objectrepositoryutility.CreateOrganizationpage;
import com.crm.bizdom.objectrepositoryutility.Home;
import com.crm.bizdom.objectrepositoryutility.Login;

import com.crm.bizdom.objectrepositoryutility.OrganizImg;


public class CreateOrganization {
	
	static WebDriver driver;
	@Test
	public void createop(String industriesOption) throws Throwable{
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
		
		//Loginpage
			Login lp=new Login(driver);
			lp.loginToAPP(username,password);
			lp.getLoginBtn().click();
			
			//Homepage
			Home hp=new Home(driver);
			hp.getOrglink().click();
			
			//OrganizationImgBtn
			OrganizImg oig=new OrganizImg(driver);
			oig.ImgOrg();
			
			//CreateOrganizationPage
			CreateOrganizationpage co=new CreateOrganizationpage(driver);
			co.creatOrganization(orgname, industriesOption);
	
			WebElement text = co.getorgtitle();
			
			
			//logout
			hp.getsignoutbtn().click();
			
			

}
	public void creatOrganization(String orgName, CreateOrganizationpage co, String industriesOption, String orgname) throws Throwable {
		co.creatOrganization(orgname, industriesOption);
		
		
	}
}
