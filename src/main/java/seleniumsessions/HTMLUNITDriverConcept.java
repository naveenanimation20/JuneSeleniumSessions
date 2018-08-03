package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUNITDriverConcept {

	public static void main(String[] args) throws InterruptedException {

		//headless browser
		//no browser
		//testing is happening without opening the browser
		//very fast
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		System.out.println("title before loging::"+ driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(2000);

		System.out.println("after login, title is:===" + driver.getTitle());
		
		
		
		
	}

}
