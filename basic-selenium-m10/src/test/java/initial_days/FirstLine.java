package initial_days;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstLine {
	public static void main(String[] args) {
//		ChromeDriver driver1 = new ChromeDriver();
//		FirefoxDriver driver2 = new FirefoxDriver();
//		EdgeDriver driver3 = new EdgeDriver();

//		after upcasting
//		WebDriver driver1 = new ChromeDriver();
//		WebDriver driver2 = new FirefoxDriver();
//		WebDriver driver3 = new EdgeDriver();
				
//		after runtime polymorphism
		WebDriver driver = new ChromeDriver();

		/* webdriver is the type
		 * driver is ref var
		 * new is a keyword, which will create random memory space in heap area
		 * cd(), this constructor call will do 3 jobs
		 * 1> it will start the server
		 * 2> it will launch the empty chrome browser
		 * 3> it will load, reg. and re-initialize the non-static members
		*/		
				  driver = new FirefoxDriver();
		          driver = new EdgeDriver();
	}
}
