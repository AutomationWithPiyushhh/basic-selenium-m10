package learning_iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_Frames {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/frames.html");

//		driver.switchTo().frame("frame_a");
//		driver.switchTo().frame(0);

		WebElement frameElement = driver.findElement(By.id("frame_a"));
		driver.switchTo().frame(frameElement);

		driver.findElement(By.id("name_input")).sendKeys("Dinga");
		
		driver.switchTo().defaultContent();	
		
		driver.switchTo().frame(1);
		driver.findElement(By.id("critical_check")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
