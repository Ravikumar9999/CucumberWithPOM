package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.util.TestBase;

public class HomePage extends TestBase{
	
	
	
	@FindBy(xpath = "//td[contains(text(),'User: Ravi Kumar')]")
	WebElement userNameLabel;
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactsLink;
	
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	@FindBy(xpath = "//a[contains(text(),'Cases')]")
	WebElement casesLink;
	
	@FindBy(xpath = "//a[contains(text(),'Call')]")
	WebElement callLink;
	
	@FindBy(xpath = "//a[contains(text(),'Email')]")
	WebElement emailLink;
	
	//Initializing the Page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}

	
	
	public void clickOnNewContactLink() {
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactsLink.click();
	}

}
