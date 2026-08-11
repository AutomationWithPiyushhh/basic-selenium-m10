package learning_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/* hover
 * 	moveToElement(element)
 * 	moveByOffset(x,y)
 * 	moveToElement(element, x, y)

 * left click
 * 	click()
 * 	click(element)
 
 * right click
 * 	contextClick()
 * 	contextClick(element)
 
 * double click
 * 	doubleClick()
 * 	doubleClick(element)
 
 * click and hold
 * 	clickAndHold()
 * 	clickAndHold(element)

 * release
 * 	release()
 * 	release(element)
 
 * drag and drop
 * 	dragAndDrop(src,dest)
 * 	dragAndDropBy(src, x, y)
 
 * scroll
 * 	scrollToElement(element)
 * 	scrollByAmount(x, y)
 * 	
*/
public class AWP_MouseActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/actions.html");

		Actions act = new Actions(driver);

		Thread.sleep(1500);

//		left click
//		WebElement lc = driver.findElement(By.id("click-box"));

//		act.moveToElement(lc).click().build().perform();
//		act.click(lc).perform();

//		right click
		WebElement rc = driver.findElement(By.id("right-click-area"));

//		act.moveToElement(rc).perform();
//		act.contextClick().perform();

//		act.contextClick(rc).perform();

//		doubleClick
		
		

//		click and hold
//		WebElement hold = driver.findElement(By.id("hold-icon"));
//		act.clickAndHold(hold).build().perform();
//		
//		Thread.sleep(5000);
//		
////		release
//		act.release().build().perform();

//		dragAndDrop
//		WebElement laptop = driver.findElement(By.id("prod-laptop"));
//		WebElement iphone = driver.findElement(By.id("prod-phone"));
//		WebElement watch = driver.findElement(By.id("prod-watch"));
//		WebElement headset = driver.findElement(By.id("prod-headphones"));
//		
//		WebElement dest = driver.findElement(By.id("cart-zone"));
//		
//		act.dragAndDrop(laptop, dest).build().perform();
//		Thread.sleep(1000);
//		act.dragAndDrop(iphone, dest).build().perform();
//		Thread.sleep(1000);
//		
//		act.dragAndDropBy(watch, 200, 0).build().perform();
//		Thread.sleep(1000);
//		act.dragAndDropBy(headset, 250, 0).build().perform();

//		scroll
		
		Thread.sleep(2000);
		
		WebElement footer = driver.findElement(By.xpath("//p[contains(text(), 'AutomationWithPiyush')]"));

//		act.scrollToElement(footer).build().perform();
		act.scrollByAmount(0, 300).build().perform();
		Thread.sleep(1000);
		act.scrollByAmount(0, 300).build().perform();
		Thread.sleep(1000);
		act.scrollByAmount(0, 300).build().perform();
		Thread.sleep(1000);
		
//		seekbar/slider
//		moveToElement(element)
//		moveByOffset(x, y)
//		click()
		
		Thread.sleep(1000);
		
		WebElement slider = driver.findElement(By.id("pulse-slider"));
		
//		act.moveToElement(slider).moveByOffset(100, 0).click().build().perform();
		act.moveToElement(slider, 100, 0).click().build().perform();

		Thread.sleep(3000);
		driver.quit();
	}
}
