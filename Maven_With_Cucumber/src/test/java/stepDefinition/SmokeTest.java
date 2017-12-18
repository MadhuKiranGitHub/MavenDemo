package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

	WebDriver driver;
	
@Given("^Open Browser$")
public void open_Browser() throws Throwable {
	System.setProperty("webdriver.gecko.driver", "/Users/madhu/Downloads/geckodriver");
	driver=new FirefoxDriver();
	driver.get("https://login.salesforce.com/");
}

@When("^Give valid \"([^\"]*)\" and \"([^\"]*)\"$")
public void give_valid_username_and_password(String uname, String pswd) throws Throwable {
   driver.findElement(By.id("username")).sendKeys(uname); 
   driver.findElement(By.id("password")).sendKeys(pswd);
}

@Then("^User should be successfully logged in$")
public void user_should_be_successfully_logged_in() throws Throwable {
 driver.findElement(By.id("Login")).click();
 driver.quit();
}

}
