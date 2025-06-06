package pagebase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class testbase extends browserIne {
	
	public static void clicOnElement(By locator) {
		
		try{
			
			if(driver.findElement(locator).isDisplayed()) {
				driver.findElement(locator).click();
			}else {
				System.out.println("Element not clickable");
			}
			
		}
		catch(Exception e){
			
			System.out.println("Exception occurred while clicking the element: " + e.getMessage());
	        e.printStackTrace();
			
		}
	}
	
	public static String getpagetitle() {
		
		String title = driver.getTitle();
		
		return title;
		
	}
	
	public static boolean iselementisvisible(By locator) {
		
		boolean flag = false;
		try {
			
			flag = driver.findElement(locator).isDisplayed();
		}catch(Exception e) {
			
		}
		
		return flag;
	}
}
