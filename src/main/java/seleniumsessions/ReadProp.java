package seleniumsessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadProp {

	public static void main(String[] args) throws IOException {

		WebDriver driver = null;
		//how to read propeties file:
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("/Users/NaveenKhunteta/Documents/workspace/JuneSeleniumSession/"
				+ "src/main/java/seleniumsessions/config.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")){
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("Safari")){
			driver = new SafariDriver();
		}
		else if(browserName.equals("IE")){
			driver = new InternetExplorerDriver();
		}
		else{
			System.out.println("no browser value is given");
		}
		
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.className(prop.getProperty("freecrm_logoimage_classname"))).isDisplayed();
		
		driver.findElement(By.name(prop.getProperty("username_name"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name(prop.getProperty("password_name"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("loginBtn_xpath"))).click();
		
		
			
		
		
		
	}

}
