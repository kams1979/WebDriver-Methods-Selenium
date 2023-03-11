package WebDriverMethods;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class marchtask {
   public static void main(String[] args) {
	   
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://adactinhotelapp.com/");
	   driver.manage().window().maximize();
	   //Dimension d= new Dimension(500,500);
	 //  driver.manage().window().setSize(d);
	   driver.navigate().to("https://www.booking.com/");
	   org.openqa.selenium.Dimension size = driver.manage().window().getSize();
	   driver.navigate().back();
	   driver.navigate().forward();
	   String title = driver.getTitle();
	   System.out.println(title);
	   String currentUrl = driver.getCurrentUrl();
	   System.out.println(currentUrl);
	   driver.close();
	   
	   
	
}
}
