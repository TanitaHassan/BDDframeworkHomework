package com.facebook.stepDefination;

import com.facebook.base.BaseStep;
import com.facebook.loginPages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginScenarioOutlineStep extends BaseStep {
	LoginPage lp;

	@Given("i enter {string} and {string} for open apps")
	public void iEnterAndForOpenApps(String browser, String Url) {
		openApp(browser,Url);
	}
	@When("I enter {string} and {string}")
	public void iEnterAnd(String username, String password) {
		lp=new LoginPage(driver);
		lp.userNameMethod(username);
		lp.passWordMethod(password);
		
	}
	@When("i click logg in button")
	public void iClickLoggInButton() {
		lp.logingButton();
		
	}
	@Then("user close the apps")
	public void userCloseTheApps() {
		closeApp();
		
	}




}
