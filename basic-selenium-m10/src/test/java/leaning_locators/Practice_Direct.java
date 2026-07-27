package leaning_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Direct {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationwithpiyush.vercel.app/locators.html");

//		Task 1: Locate the Username field 

//		hey driver, find the element by id => user_login_field 
		WebElement username = driver.findElement(By.id("user_login_field"));

//		type something on username
		username.sendKeys("admin");

//		hey driver, find the element by name => security_passphrase
		WebElement password = driver.findElement(By.name("security_passphrase"));

//		type something on password field
		password.sendKeys("123456789");

//		hey driver, find the element by class => primary_action
		WebElement submitBtn = driver.findElement(By.className("primary_action"));

//		click on submitButton
		submitBtn.click();

//		hey driver, find the element by link text => <a>Reset Password</a>
		WebElement reset = driver.findElement(By.linkText("Reset Password"));

		reset.click();

//		hey driver, find the element by  partial link text of <a>Logout User: John Doe</a>
		WebElement logout = driver.findElement(By.partialLinkText("Logout User"));

		logout.click();

		Thread.sleep(3000);
		driver.quit();
	}
}
