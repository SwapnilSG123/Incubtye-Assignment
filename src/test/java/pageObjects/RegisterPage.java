package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.core.cli.Main;

public class RegisterPage {
	
	public static final By FirstName = By.id("firstname");
	public static final By LastName = By.id("lastname");
	public static final By Email = By.name("email");
	public static final By Pass = By.name("password");
	public static final By PassConfirm = By.name("password_confirmation");
	public static final By CreateAnAccountbutton = By.xpath("//button[@title=\"Create an Account\"]//span[contains(text(),\"Create an Account\")]");  
	public static final By successMessage = By.id("//div[@data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]");
	//public static final By dropdown  = By.id("//div[@class=\"panel header\"]//button[@type=\"button\"]");

	
			
   

}
