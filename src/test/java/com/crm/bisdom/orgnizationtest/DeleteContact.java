package com.crm.bisdom.orgnizationtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.crm.bizdom.genericrepository.ExcelUtility;
import com.crm.bizdom.genericrepository.Fileutility;
import com.crm.bizdom.genericrepository.Javautility;
import com.crm.bizdom.objectrepositoryutility.ContactImg;
import com.crm.bizdom.objectrepositoryutility.CreateContactPage;
import com.crm.bizdom.objectrepositoryutility.Home;
import com.crm.bizdom.objectrepositoryutility.Login;

public class DeleteContact {
	static WebDriver driver;
	public DeleteContact(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}
	@Test
	public void contact() throws Throwable{
		Fileutility fileutil =new Fileutility();
		Javautility javaUtil=new Javautility();
		ExcelUtility excel=new ExcelUtility();
		String brosweName=fileutil.getPropertykeyValue("browser");
		String url=fileutil.getPropertykeyValue("url");
		String username=fileutil.getPropertykeyValue("username");
		String password=fileutil.getPropertykeyValue("password");	
		String contactname=excel.getDatafromExcel("Sheet", "TC_01", "Contact Name")+javaUtil.generateRandomNum();
		
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
			
			//ContactImgBtnPage
			ContactImg ci=new ContactImg(driver);
			ci.getCreatecontactBtn().click();
			
			//CreateContactPage
			CreateContactPage ccp=new CreateContactPage(driver);
			ccp.createcontact();
			
			//DeleteContact
			DeleteContact dc=new DeleteContact(driver);
			dc.deletecontact();
			

}
	private void deletecontact() {
		// TODO Auto-generated method stub
		
	}
}
