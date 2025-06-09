package pagebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserIne {

	public static WebDriver driver;
	public static WebDriver openbrowser(String browsername) {
		
		String browser = browsername;
		if (browser.equalsIgnoreCase("chrome")) {
			
			 WebDriverManager.chromedriver().setup();
		     driver=new ChromeDriver();
		     driver.manage().window().maximize();
		}
		
		return driver;
	}
	
	public static void teardown() {
		//driver.quit();
	}
}
