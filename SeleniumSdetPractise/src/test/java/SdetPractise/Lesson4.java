package SdetPractise;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lesson4 {
	
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		// <a>  tag use Next page connection by selector hub xpath/ link text/ partial link tag
		driver.get("https://w3schools.com/howto/howto_css_next_prev.asp");
		driver.findElement(By.xpath("//div[@id='main']//div[2]//a[2]")).click();
		
		// cannot make next page connection code issue
		/*driver.get("http://sheradambd.com/home");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("mouse");
		driver.findElement(By.xpath("//button[@type='button']")).click();	
		driver.findElement(By.xpath("//span[contains(text(),'...')]")).click();*/
	}

}
