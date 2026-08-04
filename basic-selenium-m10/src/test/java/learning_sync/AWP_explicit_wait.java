package learning_sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AWP_explicit_wait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/synchronization.html");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

//		click on unlock input button
		driver.findElement(By.id("trigger-input")).click();

//		type something in command line
		WebElement textField = driver.findElement(By.cssSelector("input[type='text']"));

//		implement explicit wait 
		wait.until(ExpectedConditions.elementToBeClickable(textField));

		textField.sendKeys("xyz"); // ElementNotInteractableException

//		click on generate report button
		WebElement btnAlert = driver.findElement(By.id("btn-alert"));
		btnAlert.click();

		wait.until(ExpectedConditions.alertIsPresent());

//		handle alert
		driver.switchTo().alert().accept();

		Thread.sleep(3000);
		driver.quit();
	}
}
