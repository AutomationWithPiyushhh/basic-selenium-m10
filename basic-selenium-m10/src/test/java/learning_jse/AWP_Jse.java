package learning_jse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_Jse {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		JavascriptExecutor jse = (JavascriptExecutor) driver;

//		driver.get("https://automationwithpiyush.vercel.app/locatorsSignin.html");
//		jse.executeScript("window.location='https://automationwithpiyush.vercel.app/locatorsSignin.html'");

//		String url1 = "https://automationwithpiyush.vercel.app/locatorsSignin.html";
//		String url2 = "https://facebook.com/";
//		String url3 = "https://www.instagram.com/";

//		jse.executeScript("window.location='" + url1 + "';");
//		Thread.sleep(1000);
//		jse.executeScript("window.location='" + url2 + "';");
//		Thread.sleep(1000);
//		jse.executeScript("window.location='" + url3 + "';");

		String url1 = "https://automationwithpiyush.vercel.app/locatorsSignin.html";
		String url2 = "https://facebook.com/";
		String url3 = "https://www.instagram.com/";

		jse.executeScript("window.location=arguments[0];", url1);
		Thread.sleep(1000);
//		jse.executeScript("window.location=arguments[0];", url2);
//		Thread.sleep(1000);
//		jse.executeScript("window.location=arguments[0];", url3);

//		ṭype something in username field
		WebElement username = driver.findElement(By.id("email"));
				
//		jse.executeScript("document.getElementById('email').value='admin'");
		jse.executeScript("arguments[0].value='admin'", username);
		
		WebElement check = driver.findElement(By.id("terms_checkbox"));
		jse.executeScript("arguments[0].click();", check);
//		Thread.sleep(1000);

//		jse.executeScript("window.scrollBy(0, 500);");

		Thread.sleep(2000);
		driver.quit();

	}
}
