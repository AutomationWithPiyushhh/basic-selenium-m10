package learning_sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_implicit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://automationwithpiyush.vercel.app/synchronization.html");
		
		WebElement start = driver.findElement(By.xpath("//button[contains(text(), 'PROCESS')]"));
		start.click();
				
		WebElement stop = driver.findElement(By.xpath("//button[contains(text(), 'PROCESS')]"));
		stop.click();
		
		WebElement startVerify = driver.findElement(By.xpath("//button[contains(text(), 'START')]"));
		if (startVerify.isDisplayed()) {
			System.out.println("successfully done the task...");
		}
		
//		Thread.sleep(3000);
		driver.quit();
	}
}
