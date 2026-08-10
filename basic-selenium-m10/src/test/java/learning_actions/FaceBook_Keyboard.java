package learning_actions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FaceBook_Keyboard {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		Actions act = new Actions(driver);

		Thread.sleep(2000);

////		write something directly 
//		act.sendKeys("admin").build().perform();
//
////		press tab
//		act.sendKeys(Keys.TAB).build().perform();
//
////		write something
//		act.sendKeys("123456789").build().perform();
//
////		press enter
//		act.sendKeys(Keys.ENTER).build().perform();

//		act.sendKeys("admin")
//			.sendKeys(Keys.TAB)
//			.sendKeys("123456789")
//			.sendKeys(Keys.ENTER)
//			.build().perform();

		act.sendKeys("admin" + Keys.TAB + "123456789" + Keys.ENTER).build().perform();

		
		
		
//		keyDown() => key press
//		keyUp() => key release
		
		
//		write something wherever control is present
		act.sendKeys("admin@123").build().perform();
		
//		select all
		act.keyDown(Keys.CONTROL).perform();
		act.sendKeys("a").perform();
		act.keyUp(Keys.CONTROL).perform();
		
//		copy
		act.keyDown(Keys.CONTROL).perform();
		act.sendKeys("c").perform();
		act.keyUp(Keys.CONTROL).perform();
		
//		tab
		act.sendKeys(Keys.TAB).perform();		
		
//		paste
		act.keyDown(Keys.CONTROL).perform();
		act.sendKeys("v").perform();
		act.keyUp(Keys.CONTROL).perform();
		
//		enter
		act.sendKeys(Keys.ENTER).perform();		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
