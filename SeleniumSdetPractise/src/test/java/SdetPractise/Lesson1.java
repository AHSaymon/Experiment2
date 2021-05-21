package SdetPractise;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lesson1 {
	//Using webdrivermanager
	public static void main(String[] args) {
		
		//1.Launch Browsers in WebDriver  For firefox 
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		
		// for chrome:
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); */
		// Go to C:\Users\User\AppData\Local\Google\Chrome and delete application file 
		
		// 2. open url:
		//driver.get("https://nexchar.com/");
		
		// 6. Use navigate to get url
		driver.navigate().to("http://softologyit.com/");
		driver.get("https://nexchar.com/");
		
		// 3. capture Title of the page:
		System.out.println("The title of the page:"+ driver.getTitle());
		//4. capture url of the page:
		System.out.println("The current url is:"+ driver.getCurrentUrl());
		//5. capture page source of the Page:
		System.out.println("Here is page source:"+ driver.getPageSource());
		
		// 7. for navigate back button
		driver.navigate().back();
		// 8. for navigate forward
		driver.navigate().forward();
		// 9. for navigate refresh
		driver.navigate().refresh();
		
		//10. Find element1 for going to sign up page
		driver.findElement(By.cssSelector("a[class='btn btn-register']")).click();
		//11. Find element2 for going to demo page
		driver.findElement(By.xpath("//span[contains(text(),'Demo')]")).click();
		
		driver.get("https://youtube.com/");
		// 12. Provide Text from input box
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("QAmon");
		
		// 13. Clear text from input box
			// one way
		
		/*WebElement searchbox= driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/div[1]/ytd-masthead[1]/div[3]/div[2]/ytd-searchbox[1]/form[1]/div[1]/div[1]/input[1]"));
		searchbox.clear();*/
			//best way
		
		driver.findElement(By.xpath("//input[@id='search']")).clear();
		//driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/div[1]/ytd-masthead[1]/div[3]/div[2]/ytd-searchbox[1]/form[1]/div[1]/div[1]/input[1]")).clear();
		
		// findelements method
		/*driver.get("https://demo.nopcommerce.com/");
		List<WebElement>links=driver.findElements(By.xpath("//div[@class='footer']//a"));
		System.out.println("Number of elements:" +links.size());*/

		// 14. Capturing text from inputbox
		WebElement capturetext= driver.findElement(By.id("search"));
		System.out.println("Result from id: "+ capturetext.getAttribute("id"));
	}
	
	
}
