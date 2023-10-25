package com.facebook.stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {
	WebDriver driver;
	
		@Given("open application")
		public void openApplication() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		    
		}
		@When("enter username")
		public void enterUsername() {
			driver.findElement(By.id("email")).sendKeys("tanita");
		   
		}
		@When("enter password")
		public void enterPassword() {
			driver.findElement(By.id("pass")).sendKeys("123");
		    
		}
		@When("click the login button")
		public void clickTheLoginButton() {
			
		}
		@Then("i can logged in")
		public void iCanLoggedIn() {
		   
		}




}
