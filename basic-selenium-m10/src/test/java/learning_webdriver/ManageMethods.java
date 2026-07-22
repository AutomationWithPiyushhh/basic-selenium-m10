package learning_webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		Window win = driver.manage().window();

//		driver.manage().window().maximize();
//		driver.manage().window().minimize();
//		driver.manage().window().fullscreen();

//		win.maximize();
//		win.minimize();
//		win.fullscreen();

//		size of window

		Dimension dim1 = win.getSize();

		int h = dim1.getHeight();
		int w = dim1.getWidth();

		System.out.println(dim1); // (w, h)
		System.out.println(w);
		System.out.println(h);

//		set the size
		win.setSize(new Dimension(100, 100));

//		position of window

		Point pt1 = win.getPosition();

		int x = driver.manage().window().getPosition().getX();

		int y = pt1.getY();

		System.out.println(pt1); // => (10, 10)
		System.out.println(x);
		System.out.println(y);

//		set the position
		driver.manage().window().setPosition(new Point(300, 650));
		
		Thread.sleep(7000);
		driver.quit();
	}
}
