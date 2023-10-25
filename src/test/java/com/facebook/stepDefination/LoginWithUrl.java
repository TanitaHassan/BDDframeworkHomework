package com.facebook.stepDefination;

import com.facebook.base.BaseStep;
import com.facebook.loginPages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithUrl extends BaseStep  {
	LoginPage lp;

	@Given("i give {string} and {string}")
	public void iGiveAnd(String browser, String Url) {
		openApp(browser,Url);
	}
	@When("I put my name {string}")
	public void iPutMyName(String username) {
		lp=new LoginPage(driver);
		lp.userNameMethod(username);
		
	}
	@When("put my password {string}")
	public void putMyPassword(String password) {
		lp.passWordMethod(password);
		
	}
	@When("click loginButton")
	public void clickLoginButton() {
		
	}
	@Then("I should be logeeed into in")
	public void iShouldBeLogeeedIntoIn() {
		
	}




}
