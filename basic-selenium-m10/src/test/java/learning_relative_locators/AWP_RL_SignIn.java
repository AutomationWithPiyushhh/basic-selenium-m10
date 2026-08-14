package learning_relative_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class AWP_RL_SignIn {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://automationwithpiyush.vercel.app/locatorsSignin.html");
		
		driver.findElement(RelativeLocator
								.with(By.tagName("button")) // target element
								.below(By.id("password"))   // reference element
				).click();
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
