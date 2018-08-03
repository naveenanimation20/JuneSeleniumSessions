package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		
		Thread.sleep(3000);
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		
		System.out.println("the parent window id is: "+ parentWindowId);
		
		String childWindowId = it.next();
		
		System.out.println("the child window id is: "+ childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		System.out.println("title of child window is: "+ driver.getTitle());
		
		driver.close(); //close the pop up window
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println("title of parent window is: "+ driver.getTitle());
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
