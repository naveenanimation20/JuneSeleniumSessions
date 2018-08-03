package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		
		//Creating a webdriver interface object
		WebDriver driver = new ChromeDriver();
		
		//Opening an URL in a browser
		//driver.get("https://www.freecrm.com/index.html");
		driver.get("https://www.freecrm.com/register/");
		
		//Clicking on the SignUp link
		//driver.findElement(By.linkText("Sign Up")).click();		
		//Trying to identify all the elements in the form
		driver.findElement(By.name("first_name")).sendKeys("Sunil");
		
		driver.findElement(By.name("surname")).sendKeys("Kumar");
		
		driver.findElement(By.name("email")).sendKeys("Sunil0987@gmail.com");
		
		driver.findElement(By.name("email_confirm")).sendKeys("Sunil0987@gmail.com");
		
		driver.findElement(By.name("username")).sendKeys("SunilK");
		
		driver.findElement(By.name("password")).sendKeys("test123");
		
		driver.findElement(By.name("passwordconfirm")).sendKeys("test123");
		
		//driver.findElement(By.name("agreeTerms")).click();
		
			if(driver.findElement(By.name("agreeTerms")).isSelected())
			
				{
					System.out.println("Check box is already selected");
				}
		
		   else
		        {			   
			       driver.findElement(By.name("agreeTerms")).click();
		        }
		
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(5000);
				
		driver.close();
			
	}

}
