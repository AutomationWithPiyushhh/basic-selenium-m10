package learning_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_signup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationwithpiyush.vercel.app/signup.html");

		WebElement fn = driver.findElement(By.name("firstname"));
		fn.sendKeys("Dinga");

		Thread.sleep(1000);

		fn.clear();

		Thread.sleep(1000);

		fn.sendKeys("Dingi");

//		click on male radio
		WebElement male = driver.findElement(By.cssSelector("input[value='2']"));

		if (male.isDisplayed() && male.isEnabled()) {
			male.click();
			if (male.isSelected()) {
				System.out.println("Male radio button got selected....");
			}
		}
		
		Thread.sleep(2000);
		
//		type = "submit" and descendant of <form>
		driver.findElement(By.cssSelector("button[type='submit']")).submit();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
