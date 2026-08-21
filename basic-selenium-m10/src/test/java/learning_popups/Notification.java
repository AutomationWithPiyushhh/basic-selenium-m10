package learning_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Notification {
	public static void main(String[] args) throws InterruptedException, AWTException {

//		to avoid notification popup we need to change the setting of browser
		/*
1	--start-maximized				Opens Chrome maximized
2	--disable-notifications			Blocks browser notifications
3	--incognito						Opens Chrome in Incognito mode
4	--headless=new					Runs Chrome without opening the UI
5	--disable-popup-blocking		Disables Chrome's popup blocker
6	--disable-extensions			Disables installed Chrome extensions
7	--disable-infobars				Prevents certain Chrome information bars
8	--disable-gpu					Disables GPU acceleration; useful in some headless/CI environments
9	--window-size=1920,1080			Sets browser window dimensions
10	--ignore-certificate-errors		Ignores SSL/certificate errors, useful in test environments
		*/		
		
		
//		ChromeOptions setting = new ChromeOptions();
//		setting.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.easemytrip.com/");
		
		
		Thread.sleep(7000);
		
//		handle the popup
//		Actions act = new Actions(driver);
//		act.keyDown(Keys.ESCAPE).build().perform();
//		act.keyUp(Keys.ESCAPE).build().perform();
		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		robot.keyRelease(KeyEvent.VK_ESCAPE);
		
		Thread.sleep(7000);
		driver.quit();
	}
}
