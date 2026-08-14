package learning_jse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_Jse2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.get("https://www.oracle.com/java/technologies/javase-jdk26-doc-downloads.html");
//		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		
//		driver.findElement(By.linkText("jdk-26.0.2_doc-all.zip")).click();
//		
//		WebElement target = driver.findElement(By.linkText("Download jdk-26.0.2_doc-all.zip"));
//		
////		target.click();
//		
//		jse.executeScript("arguments[0].click()", target);
//
//		Thread.sleep(5000);
//		
		driver.get("https://automationwithpiyush.vercel.app/js-executor.html");
		
		WebElement input =  driver.findElement(By.id("hidden-treatment-input"));
		
		jse.executeScript("arguments[0].value='admin'", input);
		
		Thread.sleep(3000);
		driver.quit();

	}
}
