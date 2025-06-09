package pagebase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class testbase extends browserIne {

	public static void clicOnElement(By locator) {

		try {

			if (driver.findElement(locator).isDisplayed()) {
				driver.findElement(locator).click();
			} else {
				System.out.println("Element not clickable");
			}

		} catch (Exception e) {

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
		} catch (Exception e) {

		}

		return flag;
	}

	public static void typeintextbox(By locator, String text) {

		try {

			if (driver.findElement(locator).isDisplayed()) {
				driver.findElement(locator).sendKeys(text);

			}

		} catch (Exception e) {

		}

	}

	public String gettextfromelement(By locator) {
         String Exp_Name = "";
		try {
			if (driver.findElement(locator).isDisplayed()) {
				 Exp_Name = driver.findElement(locator).getText();

			}

		} catch (Exception e) {

		}
		return Exp_Name;

	}
	
	public static void selectDropdownByVisibleText(By locator, String visibleText) {
	    try {
	        WebElement dropdownElement = driver.findElement(locator);
	        
	        if (dropdownElement.isDisplayed()) {
	            Select dropdown = new Select(dropdownElement);
	            dropdown.selectByVisibleText(visibleText);
	            System.out.println("Dropdown value selected: " + visibleText);
	        }
	    } catch (Exception e) {
	        System.out.println("Failed to select dropdown value: " + visibleText);
	        e.printStackTrace();
	    }
	}
	
	
	 public static String getFeedbackMessage(By locator, String text) {
	        try {
	            WebElement success = driver.findElement(locator);
	            if (success.isDisplayed()) {
	                return success.getText();
	            }
	        } catch (Exception e) {
	            // ignore
	        }

	        try {
	            WebElement error = driver.findElement(locator);
	            if (error.isDisplayed()) {
	                return error.getText();
	            }
	        } catch (Exception e) {
	            // ignore
	        }

	        return "No message displayed";
	    }


	
	

}
