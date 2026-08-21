package learning_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://automationwithpiyush.vercel.app/popups.html");
			
		
//		Thread.sleep(3000);
		
//		explicit wait
		
		
		Alert ale = driver.switchTo().alert();
		ale.sendKeys("Dingi");
//		ale.accept();
		ale.dismiss();
		
		String text = ale.getText();
		System.out.println(text);
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
