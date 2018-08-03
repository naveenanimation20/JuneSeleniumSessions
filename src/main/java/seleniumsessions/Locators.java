package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		// 1. id: -- I
		// driver.findElement(By.id("login1")).sendKeys("testNaveen@rediff.com");
		// driver.findElement(By.id("password")).sendKeys("test@1234");

		// WebElement username = driver.findElement(By.id("login1"));
		// username.sendKeys("test@rediff.com");
		//
		// WebElement password = driver.findElement(By.id("password"));
		// password.sendKeys("test@123");

		// 2. name: -- I, II
		// driver.findElement(By.name("login")).sendKeys("test@rediff.com");
		// driver.findElement(By.name("passwd")).sendKeys("test@123");

		// 3. xpath -- address of any web element -- III
		// driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("test@rediff.com");
		// driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test@123");

		// 4. cssSelector: -- III
		// driver.findElement(By.cssSelector("#login1")).sendKeys("test@rediff.com");
		// driver.findElement(By.cssSelector("#password")).sendKeys("test@123");

		// 5. linkText: only for links -- IV
		 driver.findElement(By.linkText("Create a new account")).click();

		// 6. partial link text: only for links -- not recommended -- V
		// driver.findElement(By.partialLinkText("Create a new")).click();

		// 7. className: not recommended, sometimes it may produce duplicate elements -- IV
		driver.findElement(By.className("submitbtn")).click();
		
		
	}

}
