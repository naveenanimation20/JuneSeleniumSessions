package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.Xls_Reader;

public class FreeCrmSignUp {
	
	public static void main(String args[]){
		
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		Xls_Reader reader = new Xls_Reader("/Users/NaveenKhunteta/Documents/workspace/"
				+ "JuneSeleniumSession/src/main/java/testdata/FreeCrmTestData.xlsx");
		
		String sheetName = "login";
		
		int rowCount = reader.getRowCount(sheetName);
		System.out.println("total num of rows: "+ rowCount);
	
		
		for(int rowNum=2; rowNum<=rowCount; rowNum++){
			String username = reader.getCellData(sheetName, "username", rowNum);
			System.out.println(username);
			
			String password = reader.getCellData(sheetName, "password", rowNum);
			System.out.println(password);
			
			driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("username")).sendKeys(username);
			
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(password);
			
			
		}
		
		
		
		
		
	}
	
	//1. poi depend
	//2. xls_reader
	//3. recording
	//4. code
	//testng.xml
	
	
	
	
	

}
