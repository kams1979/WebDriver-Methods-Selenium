package WebDriverMethods;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task11 {
	
	static WebDriver driver;
	public static  void BrowserLaunch() {
		
         driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().fullscreen();

	}
	
	
       public static void WebDrivermethods() {
		
		String currentUrl = driver.getCurrentUrl();          
		System.out.println(currentUrl);
		String title = driver.getTitle();                      
		System.out.println(title);
		
		driver.navigate().to("https://www.flipkart.com/");    
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		driver.navigate().back();                            
		driver.navigate().forward();                         
		driver.navigate().refresh();  
		
		//driver.getPageSource();
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();

	}
	private static void WebElementMethods() throws Throwable {
           WebElement element = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
           element.click();
           Thread.sleep(2000);
           driver.findElement(By.name("email")).sendKeys("9940155509");
           
           WebElement element2 = driver.findElement(By.xpath("//input[@id='continue']"));
           element2.click();
           driver.findElement(By.xpath("//input[@tabindex='6']")).click();
           Thread.sleep(15000);
           driver.findElement(By.xpath("//input[@type='submit']")).click();
         
	}
	public static void main(String[] args) throws Throwable {
		//WebDrivermethods();
		BrowserLaunch();
		
		WebElementMethods();
		
		
		
		
	}
	

}
