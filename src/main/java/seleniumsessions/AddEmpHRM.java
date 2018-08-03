package seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddEmpHRM {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rohith-trials641.orangehrmlive.com");

		WebElement uname = driver.findElement(By.id("txtUsername"));
		uname.clear();
		uname.sendKeys("Admin");
		
		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.clear();
		pass.sendKeys("oI3M@wa4TM");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//li[@id='menu_pim_viewPimModule']//span[text()='PIM']")).click();
		new WebDriverWait(driver, 10).
		until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Add Employee']"))));
		
		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']//span[text()='Add Employee']")).click();
		
		By name = By.id("firstName");
		sendKeys(driver, name, 50, "Navaz");
		
		driver.findElement(By.id("middleName")).sendKeys("mohz");
		driver.findElement(By.id("lastName")).sendKeys("MD");
		WebElement id = driver.findElement(By.id("employeeId"));
		id.clear();
		id.sendKeys("E004");	
		driver.findElement(By.id("systemUserSaveBtn")).click();
		
		driver.close();
		
	}
	
	public static void sendKeys(WebDriver driver, By element, int timeout, String value ){
		
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.presenceOfElementLocated(element));
		driver.findElement(element).sendKeys(value);
		
	}
	

}
