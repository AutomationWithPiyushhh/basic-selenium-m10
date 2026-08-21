package learning_popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuAppAuth {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(3000);
		
		driver.get("https://user:passwd@httpbin.org/basic-auth/user/passwd");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
