package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	
	// defining WebELement as a class variable 
	// so that i do not have to define it in every function
	private static WebElement element= null;
	//Function for every object
	public static WebElement inputbox_EmailAddress(WebDriver driver)
	{
		// input object locator identify
		//driver.findElement(By.xpath("//input[@id='Email']"));
		// store identifier into WebElement
		element=driver.findElement(By.xpath("//input[@id='Email']"));
		// not return type found
		// void type to WebElement type
		return element;
	}
	
	// function for another object
	public static WebElement inputbox_Password(WebDriver driver)
	{
		// input object locator identify
		//driver.findElement(By.xpath("//input[@id='Email']"));
		// store identifier into WebElement
		element=driver.findElement(By.xpath("//input[@id='Password']"));
		// not return type found
		// void type to WebElement type
		return element;
	}
	
	// function for another object
	public static WebElement buttonbox_SignIn(WebDriver driver)
	{
		// input object locator identify
		//driver.findElement(By.xpath("//input[@id='Email']"));
		// store identifier into WebElement
		element=driver.findElement(By.xpath("//button[@type='submit']"));
		// not return type found
		// void type to WebElement type
		return element;
	}

}
