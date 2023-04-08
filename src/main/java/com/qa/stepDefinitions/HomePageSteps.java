package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	
	@Given("user opens browser")
	public void user_opens_browser() {
	    TestBase.initialization();
	}
	
	
	@Then("user is on ligin page")
	public void user_is_on_ligin_page() {
	   loginPage = new LoginPage();
	   String title =  loginPage.validateLoginPageTitle();
	   Assert.assertEquals("Free CRM - CRM software for customer relationship management, sales, and support.", title);
	   System.out.println(title);
	}
	
	
	@Then("user logs into app")
	public void user_logs_into_app() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@Then("validate home page title")
	public void validate_home_page_title() {
		String homeTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals("CRMPRO", homeTitle);
		System.out.println(homeTitle);
	}
	
	


}
