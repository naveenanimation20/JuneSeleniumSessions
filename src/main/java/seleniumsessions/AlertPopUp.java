package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();// click on go button
		
		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());
		
		alert.accept(); //click on OK button of alert
		
		//alert.dismiss(); //to cancel the alert
		

	}

}
