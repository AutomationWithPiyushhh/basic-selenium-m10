package learning_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCloseMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

//		Load a new web page in the current browser window.
//		must pass fully qualified path
		driver.get("https://www.flipkart.com/"); // InvalidArgumentException: invalid argument

//		Get the title of the current page.
		String title = driver.getTitle();
		System.out.println(title);

//		Get the url of the current page.
		String url = driver.getCurrentUrl();
		System.out.println(url);

//		Get the source code of the last loaded webpage
//		String sourceCode = driver.getPageSource();
//		System.out.println(sourceCode);

//		driver.manage();
//		driver.navigate();

		Thread.sleep(2000);
		driver.close();
//		it will close current window 
//		it will not stop the server

		driver.quit();
//		it will close all the windows 
//		it will stop the server 

	}
}
