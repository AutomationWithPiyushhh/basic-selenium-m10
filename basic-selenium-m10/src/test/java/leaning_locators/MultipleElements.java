package leaning_locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationwithpiyush.vercel.app/");
		
		Thread.sleep(2000);

//		hey driver, find the elements by anchor tag
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());
		
		Thread.sleep(3000);
		driver.quit();
	}
}	
