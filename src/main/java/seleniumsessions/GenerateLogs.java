package seleniumsessions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateLogs {

	public static void main(String[] args) {

	Logger log = Logger.getLogger(GenerateLogs.class);
	
	System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	log.info("launching browser");
	
	driver.get("http://www.google.com");
	log.info("google url has been launched");
	
	String title = driver.getTitle();
	System.out.println("title value is: "+ title);
	
	log.info("title value is: "+ title);
	
	if(title.equals("Google")){
		System.out.println("correct title is Google");
		log.info("Correct title is Google and test cases is passed");
	}else{
		System.out.println("correct title is not Google");
		log.info("Correct title is not Google and test cases is failed");
	}
	
	driver.quit();
	log.info("browser is closed");
		
		
		
		
	}

}
