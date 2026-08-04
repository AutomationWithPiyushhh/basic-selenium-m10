package learning_sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_implicit2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://anvnacare.alwaysdata.net/doctor-details.php?id=2");
		Thread.sleep(3000);
		
		driver.findElement(By.id("appointmentDate")).sendKeys("15-08-2026");
		 
		Thread.sleep(3000);
		driver.quit();
	}
}
