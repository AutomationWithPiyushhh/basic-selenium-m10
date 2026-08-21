package learning_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("C:\\Users\\User\\git\\basic-sel-m10\\basic-selenium-m10\\src\\test\\resources\\htmlfiles\\resume.html");
		Thread.sleep(3000);
		
		
//		upload resume
		WebElement resumeUpload = driver.findElement(By.id("resume"));
		
//		resumeUpload.click();
//		C:\Users\User\OneDrive\Desktop\WindowHandle.pdf
		
		resumeUpload.sendKeys("C:\\Users\\User\\OneDrive\\Desktop\\WindowHandle.pdf");
		
		Thread.sleep(5000);
		driver.quit();
	}
}
