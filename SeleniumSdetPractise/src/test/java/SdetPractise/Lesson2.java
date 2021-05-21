package SdetPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lesson2 {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
		// 1. Select radio box
		/*driver.findElement(By.xpath("//input[@id='vfb-7-1']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-7-2']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-7-3']")).click();*/
		
		// 2. Selecting specific Check box 
		 	
		/*driver.get("https://www.nexchar.com/signin");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/label[1]/input[1]")).click();*/
		
		// 3. manually multiple check box select
		/*driver.findElement(By.xpath("//input[@id='vfb-6-0']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-6-1']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-6-2']")).click();*/
		
		
		// 4. selecting all checkbox 
		List<WebElement>checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("The size of checkbox: " + checkbox.size());
		
		// using for loop
		
		/*for(int i=0; i<=checkbox.size();i++)
		{ 
			checkbox.get(i).click();
		
		}*/ 
		
		// Using for each loop where we can create checkbox WebElement variable & to perform click action 
		
		/*for(WebElement cb:checkbox)
		{
			cb.click();
		}*/
		
		// 5. Selecting multiple check boxes by choice
		
		/*for(WebElement cb:checkbox)
		{
			// create get attribute of id in cbName variable
			String cbName=cb.getAttribute("id");
			// compare cbName with id name & do equal operation
			if(cbName.equals("vfb-6-0") || cbName.equals("vfb-6-1"))
			{
				cb.click();
			}
		}*/
		
		// 6. selecting last 2 check boxes
		// total number of checkbox- total number of checkbox we want= staring index
		// 3-2= 1
		
		/* int totalCheckboxNumber =checkbox.size();
		for(int i=totalCheckboxNumber-2;i<totalCheckboxNumber;i++)
		{
			checkbox.get(i).click();
		}*/
		
		// 7. Selecting first two check boxes
		int totalCheckboxNumber =checkbox.size();
		for(int i=0;i<totalCheckboxNumber;i++)
		{
			if(i<2)
			{
				checkbox.get(i).click();
			}
		}
	}
}
