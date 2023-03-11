package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver1 {
	private static void weddemo() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.search.yahoo.com/");
		WebElement element = driver.findElement(By.className("text"));
		element.click();
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		Dimension d= new Dimension(600,600);
		driver.manage().window().setSize(d);
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		String title = driver.getTitle();;
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.navigate().to("https://www.aol.com/?guccounter=1");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().deleteAllCookies();
	}
   
	public static void main(String[] args) throws InterruptedException {
		weddemo();
		
	
}
}
