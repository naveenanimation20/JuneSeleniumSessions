package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	/*
	 * launch browser
	    connect to DB
		delete cookies
			login to app
				home page title test
			logout app
			login to app
				home page tab test
			logout app
			login to app
				search test
			logout app
	deleteJunkCookies
	disconnectToDB
	Close browser
	 * 
	 */
	
	//1
	@BeforeSuite
	public void launchBrowser(){
		System.out.println("launch browser");
	}
	//2
	@BeforeTest
	public void connectToDB(){
		System.out.println("connect to DB");
	}
	
	//3
	@BeforeClass
	public void deleteCookies(){
		System.out.println("delete cookies");
	}
	
	//4 -- will be executed before each and every test case
	@BeforeMethod
	public void login(){
		System.out.println("login to app");
	}
	
	
	@Test(priority=1)
	public void homePageTitleTest(){
		System.out.println("home page title test");
	}
	
	@Test(priority=2)
	public void homePageTabTest(){
		System.out.println("home page tab test");
	}
	
	@Test(priority=3)
	public void searchTest(){
		System.out.println("search test");
	}
	
	@AfterMethod //-- will be executed after each and every test case
	public void logout(){
		System.out.println("logout app");
	}
	
	@AfterClass
	public void deleteJunkCookies(){
		System.out.println("deleteJunkCookies");
	}
	
	@AfterTest
	public void disconnectToDB(){
		System.out.println("disconnectToDB");
	}
	
	@AfterSuite
	public void closeBrowser(){
		System.out.println("Close browser");
	}
	

}
