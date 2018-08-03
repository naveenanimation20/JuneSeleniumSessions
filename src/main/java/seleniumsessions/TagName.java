package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.freecrm.com/index.html");
		
		
		List<WebElement> links =  driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++){
			System.out.println(links.get(i).getText());
		}
		
		
		
		
	}

}
