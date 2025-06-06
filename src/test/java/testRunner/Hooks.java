package testRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import pagebase.browserIne;

public class Hooks extends browserIne {
	
	@Before
	public void setUp(Scenario s) {
		
     System.out.println(" strted running scenario"+ s.getName());		
		
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
