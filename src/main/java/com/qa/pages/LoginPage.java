package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase{

	
	
	
	//Page Factory --Object Repository(OR):
		@FindBy(name="username")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="/html/body/div[2]/div/div[3]/form/div/div/input"
				+ "")
		WebElement loginBtn;
		
		@FindBy(xpath="//a[contains(text(),'Sign Up')]")
		WebElement SignUpBtn;
		
		@FindBy(xpath="//img[contains(@class,'img-responsive')]")
		WebElement crmLogo;
		
		
		
		
		//Initializing the Page Objects: 
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
		
		//Actions
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}
		
		
		public boolean validateCRMImage() {
			return crmLogo.isDisplayed();
		}
		
		
		public HomePage login(String un, String pwd) {
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			
			return new HomePage();
			
		}
	
}
