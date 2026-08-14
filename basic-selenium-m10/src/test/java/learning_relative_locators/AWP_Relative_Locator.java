package learning_relative_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class AWP_Relative_Locator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://automationwithpiyush.vercel.app/relative.html");
		
		Thread.sleep(3000);
		
		driver.findElement(RelativeLocator
								.with(By.tagName("button"))
								.above(By.id("center_monitor"))
							).click();

//		assignment
		driver.findElement(RelativeLocator
				.with(By.tagName("button"))  // cardiac
//				______________________________
//				______________________________
//				______________________________
//				______________________________
//				______________________________
				.above(By.id("cell_bot_right")) // skeletal
			).click();
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
