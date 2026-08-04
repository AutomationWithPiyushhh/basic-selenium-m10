package learning_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWP_signup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationwithpiyush.vercel.app/signup.html");

		WebElement fn = driver.findElement(By.name("firstname"));
		fn.sendKeys("Dinga");

		Thread.sleep(1000);

		fn.clear();

		Thread.sleep(1000);

		fn.sendKeys("Dingi");

//		click on male radio
		WebElement male = driver.findElement(By.cssSelector("input[value='2']"));

		if (male.isDisplayed() && male.isEnabled()) {
			male.click();
			if (male.isSelected()) {
				System.out.println("Male radio button got selected....");
			}
		}
		
		Thread.sleep(2000);
		
//		type = "submit" and descendant of <form>
		WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
//		submitButton.submit();
		
//		getters

		String tag = submitButton.getTagName();
		System.out.println("Tag Name: " + tag);

		String typeValue = submitButton.getAttribute("type");
		System.out.println("Type Attribute: " + typeValue);

		String colorValue = submitButton.getCssValue("background-color");
		System.out.println("Background Color: " + colorValue);

		String visibleText = submitButton.getText();
		System.out.println("Visible Text: " + visibleText);

		Dimension dim = submitButton.getSize();
		System.out.println("Size (Dimension): " + dim);
		System.out.println("Width: " + dim.getWidth());
		System.out.println("Height: " + dim.getHeight());

		Point pt = submitButton.getLocation();
		System.out.println("Location (Point): " + pt);
		System.out.println("X Coordinate: " + pt.getX());
		System.out.println("Y Coordinate: " + pt.getY());

		Rectangle rect = submitButton.getRect();
		System.out.println("Rectangle: " + rect);

		Dimension dim2 = rect.getDimension();
		System.out.println("Rectangle Dimension: " + dim2);
		System.out.println("Rectangle Width: " + rect.getWidth());
		System.out.println("Rectangle Height: " + rect.getHeight());

		Point pt2 = rect.getPoint();
		System.out.println("Rectangle Point: " + pt2);
		System.out.println("Rectangle X: " + rect.getX());
		System.out.println("Rectangle Y: " + rect.getY());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
