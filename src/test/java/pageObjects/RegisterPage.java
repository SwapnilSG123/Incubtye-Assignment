package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.core.cli.Main;

public class RegisterPage {
	
	public WebDriver  driver;
	
	public RegisterPage(WebDriver driver)
	{
	    this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	
			
			

}
