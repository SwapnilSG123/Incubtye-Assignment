package stepDefinations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObjects.HomePage;
import pagebase.browserIne;
import pagebase.testbase;
import testRunner.Hooks;

public class Steps extends browserIne{
	
//	public  WebDriver driver;
	public HomePage Hm; 
	
	@Given("user opens the Chrome browser")
	public void user_opens_the_chrome_browser() {
		
        browserIne.openbrowser("chrome");
        
	}

	@Given("user navigates to the application URL {string}")
	public void user_navigates_to_the_application_url(String URL) {
		
	    driver.get(URL);
	}

	@Then("user should see the homepage with title {string}")
	public void user_should_see_the_homepage_with_title(String Exp_title) {
	
	Assert.assertEquals("title missmatch", Exp_title, testbase.getpagetitle());
	System.out.println(testbase.getpagetitle());
	    
	}

	@When("user clicks on the {string} button")
	public void user_clicks_on_the_button(String string) {
		
		boolean tr = testbase.iselementisvisible(HomePage.CreateanAccountbtn);
		System.out.println(tr);
		testbase.clicOnElement(HomePage.CreateanAccountbtn);
	}
	
	@Then("user should see the registration page with title {string}")
	public void user_should_see_the_registration_page_with_title(String Exp_title) {
		
		String Act_title=testbase.getpagetitle();
		Assert.assertEquals("title Missmatch", Exp_title, Act_title);
		System.out.println(Act_title);
		
		
		
	   
	}

	
	
	

}
