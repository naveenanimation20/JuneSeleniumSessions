package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookTest {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.out.println("setup method");
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
	}
	
	@Test(priority=1)
	public void facebookTitleTest(){
		String title = driver.getTitle();
		System.out.println("site title is: "+ title);
		Assert.assertEquals(title, "Facebook");
	}
	
	
	@AfterMethod
	public void tearDown(){
		System.out.println("close the browser");
		driver.quit();
	}

}
