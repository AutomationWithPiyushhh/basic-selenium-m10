package leaning_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EaseMyTrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.easemytrip.com/");
		
		driver.findElement(By.id("ddate")).click();
		
		Thread.sleep(3000);
		String date = "30";
		driver.findElement(By.xpath("//div[text()='Aug 2026']/../..//li[text()='"+date+"']")).click();

		Thread.sleep(3000);
//		driver.quit();
	}

}
