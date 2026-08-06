package learning_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AWP_DD {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://automationwithpiyush.vercel.app/dropdown.html");
		
//		1> create webelement ref for dd element
//		WebElement ssdd = driver.findElement(By.id("single-select"));
		
//		2> create object of Select class
//		Select selSingle = new Select(ssdd);
		
//		3> perform the task
//		selSingle.selectByIndex(1);
//		Thread.sleep(1000);
//		selSingle.selectByValue("au");
//		Thread.sleep(1000);
//		selSingle.selectByVisibleText("India");
		
//		Thread.sleep(2000);
//		selSingle.deselectByVisibleText("India");
		
//		List<WebElement> options = selSingle.getOptions();
//		for(WebElement  i : options) {
//			System.out.println(i.getText());
//			Thread.sleep(1000);
//		}
		
//		boolean statusCountry = selSingle.isMultiple();
//		if (statusCountry) {
//			selSingle.deselectAll();
//		}
		
//		multiselect dropdown
//		1> create webelement ref for multi dd
		WebElement msdd = driver.findElement(By.id("multi-select"));
		
//		2> create object of Select class
		Select selMultiple = new Select(msdd);
		
//		3> perform the task
		selMultiple.selectByIndex(2);
		Thread.sleep(1000);
		selMultiple.selectByValue("java");
		Thread.sleep(1000);
		selMultiple.selectByVisibleText("Maven");
		
//		Thread.sleep(3000);
		
//		if (selMultiple.isMultiple()) {
//			selMultiple.deselectAll();
//		}
		
//		get first selected option
		WebElement firstSelected = selMultiple.getFirstSelectedOption();
		System.out.println(firstSelected.getText());
		
//		get all selected options
		List<WebElement> allSelected = selMultiple.getAllSelectedOptions();
		for (WebElement i : allSelected) {
			System.out.println(i.getText());
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
