package learning_tks;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Instagram {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		TakesScreenshot tks = (TakesScreenshot) driver;
		
		File src = tks.getScreenshotAs(OutputType.FILE);
		
//		get the java representation object of the physical file for destination
		File dest = new File("./errorshots/insta.png");
//		File dest = new File("C:/Users/User/git/basic-sel-m10/basic-selenium-m10/errorshots/insta.png");
		
		FileHandler.copy(src, dest);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
