package com.crm.bizdom.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.bizdom.genericrepository.WebdriverUtility;

public class Home extends WebdriverUtility{
	WebDriver driver;
	

	public Home(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	// Organization link
			@FindBy(xpath="(//a[.='Organizations'])[1]")
			private WebElement orglink;
			
	//Contact  link	
			@FindBy(xpath="//a[@href='index.php?module=Contacts&action=index']")
			private WebElement contactlnk;
			
	//Opportunity link
			@FindBy(xpath="(//a[.='Opportunities'])[1]")
			private WebElement clickOpportunityLnk;
			
			
	//logout
			@FindBy(xpath = "//img[contains(@src,'user.PNG')]")
			private WebElement adminstrationImg;
			
			  @FindBy(xpath = "//a[text()='Sign Out']")
			  private WebElement signoutLnk;

				
			

		

			public WebElement getOrglink() {
				return orglink;
			}
			
			
			public WebElement getContactlnk() {
				return contactlnk;
			}
			
			
			
			public WebElement getClickOpportunity() {
				return clickOpportunityLnk;
			}


			public WebElement getsignoutimg() {
				return adminstrationImg;
			}


			public WebElement getsignoutbtn() {
				return signoutLnk;
			}


			public void Link(){
				orglink.click();
				contactlnk.click();
				clickOpportunityLnk.click();
			}


			public void logout() {
				moveToExpectedElemnet(driver, adminstrationImg);
				signoutLnk.click();
			}


			
			

}
