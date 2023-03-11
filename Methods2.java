package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.netflix.com/in/login");
	Dimension size = driver.manage().window().getSize();
	System.out.println(size);
	Dimension d= new Dimension(600,600);
	driver.manage().window().setSize(d);
	driver.manage().window().fullscreen();
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	//driver.switchTo().window("https://www.facebook.com/");
	driver.navigate().to("https://www.hotstar.com/in");
	driver.navigate().back();
	driver.navigate().refresh();
	driver.manage().deleteAllCookies();
	
	
	
}
}
