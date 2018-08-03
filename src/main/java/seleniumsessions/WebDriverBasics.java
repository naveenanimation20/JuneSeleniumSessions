package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(); // launch chrome
		
		driver.get("https://www.google.com/"); //Enter URL
		
		String title = driver.getTitle();//get the title of the page
		System.out.println("title value is: "+ title);
		
		//validation point:
		if(title.equals("Google")){
			System.out.println("correct title");
		}else{
			System.out.println("in-correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		driver.quit();//close the browser
		
	}

}
