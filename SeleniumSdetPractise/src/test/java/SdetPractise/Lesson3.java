package SdetPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lesson3 {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		/*driver.get("https://nexchar.com/signup");
		
		// 1. handle Drop down box by visible text
		// So that we can capture drop down element into DropDownElement variable.
		WebElement DropDownElement=driver.findElement(By.id("CategoryId"));
		// creating select class object(DropDown). select class have default constructor.
		
		//  Using select class
		Select DropDown= new Select(DropDownElement);
		
		// way 1 by Visible Text
		DropDown.selectByVisibleText("Cafe and food truck");
		
		// way 2 by Value
		DropDown.selectByValue("4");
		
		// way 3 by index, by counting index which start at 0
		DropDown.selectByIndex(6);
		
		// Best way
		Select dropdown= new Select(driver.findElement(By.id("CategoryId")));
		dropdown.selectByIndex(4);
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		// 2. handle Multiple Drop downs by select method
		Select NoOfEmployeesDrp= new Select(driver.findElement(By.name("NoOfEmployees")));
		NoOfEmployeesDrp.selectByIndex(4);
		
		Select IndustryDrp= new Select(driver.findElement(By.name("Industry")));
		IndustryDrp.selectByIndex(4);*/
		
		// 4. Bootstrap drop down 
		// Not best way 
		/*driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'JavaScript')]")).click();*/
		
		/*driver.get("https://www.themallbd.com/");
		driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Skin Care & Bath')]")).click();
		driver.findElement(By.xpath("//div[@class='col-lg-4 child_menu']//ul//li//a[contains(text(),'Shower Cream & Gel')]")).click();*/
		
		
		// 3. JQuery drop down
		
		driver.get("https://jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		// select box xpath
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		
		//creating generic method
		//selectChoiceValues(driver,"choice 1");
		//selectChoiceValues(driver,"choice 2", "choice 2 3", "choice 6", "choice 6 2");
		//selectChoiceValues(driver,"all");
		
	}
	// receive all value
	public static void selectChoiceValues(WebDriver driver, String...value)
	{	
		// all choice drop down xpath 
		List<WebElement>choiceList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		// check value can contain all
		// true condtion
		if(!value[0].equalsIgnoreCase("all"))
		{
			// reading every choice list into drop down into item 
			for(WebElement item:choiceList)
			{
				// capturing all text
				String text=item.getText();
				// compare value with item text
				for(String val:value)
				{
					// if equal value the click
					if(text.equals(val))
					{
						item.click();
						break;
					}
				}
			}
		
		}
		// false condition
		else
		{
			// select all the value by using for loop
			for(WebElement item:choiceList)
			{
				item.click();
			}
		}
	}
}
