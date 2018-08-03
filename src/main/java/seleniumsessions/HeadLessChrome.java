package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChrome {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver(co);
		
		driver.get("http://www.amazon.com");
		
		System.out.println(driver.getTitle());
		
		//htmlunit
		//chromeoptions
		//phantomJS -- GhostDriver
		
	}

}
