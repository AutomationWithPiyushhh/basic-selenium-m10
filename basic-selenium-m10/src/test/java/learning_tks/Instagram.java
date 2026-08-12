package learning_tks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Instagram {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

//		TakesScreenshot tks = (TakesScreenshot) driver;
//		this tks is nothing but driver only,
//		it is just having additional features of TakesScreenshot

//		File src = tks.getScreenshotAs(OutputType.FILE);
//		
////		get the java representation object of the physical file for destination
//		File dest = new File("./errorshots/webpage.png");
////		File dest = new File("C:/Users/User/git/basic-sel-m10\\basic-selenium-m10\\errorshots\\insta.png");
//		
//		FileHandler.copy(src, dest);

		Thread.sleep(3000);
		WebElement loginBtn = driver.findElement(By.cssSelector("[aria-label='Log in']"));

//		driver.getScreenshotAs();
		File source = loginBtn.getScreenshotAs(OutputType.FILE);
		File destination = new File("./errorshots/login.png");

		FileHandler.copy(source, destination);

		Thread.sleep(3000);
		driver.quit();
	}
}
