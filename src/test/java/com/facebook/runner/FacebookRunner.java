package com.facebook.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty" ,"html:report/facebookReport.html"},
		features="src/test/resources/features",
		glue="com.facebook.stepDefination",
		tags="@Sprint5",
		snippets=SnippetType.CAMELCASE
		
		
		
		
		)
public class FacebookRunner {

}
