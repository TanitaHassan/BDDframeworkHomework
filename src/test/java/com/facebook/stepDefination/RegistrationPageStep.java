package com.facebook.stepDefination;

import com.facebook.base.BaseStep;
import com.facebook.registrationPage.RegistartionPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationPageStep extends BaseStep {
	RegistartionPage rp;
	
	

	@Given("i enter {string} and {string} for open the applicatin")
	public void iEnterAndForOpenTheApplicatin(String browser, String Url) {
		openApp(browser,Url);
		
		
	}
	@When("click the registration button")
	public void clickTheRegistrationButton() {
		rp=new RegistartionPage(driver);
		rp.createNewAccountButton();
		
	}
	@When("put firstName field {string}")
	public void putFirstNameField(String enterFirstName) {
		rp.firstNameField(enterFirstName);
		
	}
	@When("Put lastName box {string}")
	public void putLastNameBox(String enterLastName) {
		rp.lastNameField(enterLastName);
		
	}
	@When("email BoX putting {string}")
	public void emailBoXPutting(String enterEmail) {
		rp.emailField(enterEmail);
		
	}
	@When("for confirm email address {string}")
	public void forConfirmEmailAddress(String enterConfirmEmail) {
		rp.reEnterEmail(enterConfirmEmail);
		
	}
	@When("input Password {string}")
	public void inputPassword(String enterPass) {
		rp.passwordField(enterPass);
		
	}
	@When("enter birthmonth {string}")
	public void enterBirthmonth(String enterYourBirthMonth) {
		rp.monthDropDownField(enterYourBirthMonth);
	}
	@When("put BirthDay {string}")
	public void putBirthDay(String enterYourBirthDay) {
		rp.dayDropDownField(enterYourBirthDay);
		
	}
	@When("inPut birthYear {string}")
	public void inPutBirthYear(String enterBirthYear) {
		rp.yearDropDownField(enterBirthYear);
		
	}
	@When("Put GenderName {string}")
	public void putGenderName(String enterYourGender) {
		rp.radioButton(enterYourGender);
		
	}
	@Then("i can create a new account on facebook")
	public void iCanCreateANewAccountOnFacebook() {
		
	}



	

}