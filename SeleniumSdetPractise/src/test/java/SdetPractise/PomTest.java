package SdetPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.SignInPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PomTest {
	static WebDriver driver=null;
	
	public static void main(String[] args) {
	
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.get("https://www.nexchar.com/signin");
		
		SignInPage.inputbox_EmailAddress(driver).sendKeys("hamidsaymon9@gmail.com");
		
		SignInPage.inputbox_Password(driver).sendKeys("Abc12345");
		
		SignInPage.buttonbox_SignIn(driver).click();
	}
}
