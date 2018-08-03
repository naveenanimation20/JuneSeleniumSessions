package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://encodable.com/uploaddemo/");
		
		driver.findElement(By.id("uploadname1")).sendKeys("/Users/NaveenKhunteta/Documents/myJS/package.json");
		
		
		
	}

}
