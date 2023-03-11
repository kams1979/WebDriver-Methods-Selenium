package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods1 {
public static void main(String[] args) throws Throwable {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	driver.manage().window().fullscreen();
	Thread.sleep(2000);
    Dimension d=new Dimension(700,800);			
	driver.manage().window().setSize(d);
	Thread.sleep(2000);
	driver.manage().window().maximize();	
	Dimension size = driver.manage().window().getSize();
	System.out.println(size);
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	driver.close();
	driver.getPageSource();
	
	
}
}
