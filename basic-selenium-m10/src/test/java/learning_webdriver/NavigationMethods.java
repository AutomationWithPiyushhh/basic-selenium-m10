package learning_webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(1000);

		Navigation nav = driver.navigate();

		nav.to("https://x.com/");

		Thread.sleep(1000);

		nav.back();

		Thread.sleep(1000);

		nav.forward();

		Thread.sleep(2000);

		nav.refresh();

		Thread.sleep(2000);
		
		URL url = new URL("https://x.com/");
		nav.to(url);

		Thread.sleep(4000);
		driver.quit();
	}
}
