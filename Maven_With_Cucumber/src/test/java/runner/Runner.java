package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features_Files", 
			     glue={"stepDefinition"},
			     plugin={"html:target/cucumber-html-report"})
public class Runner {

}
