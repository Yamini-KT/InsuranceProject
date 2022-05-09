package tests;

import businessfunctions.ApplyInsuranceUtility;
import businessfunctions.BaseClass;
import businessfunctions.LoginLogoutUtility;
import businessfunctions.UpdateLocationUtility;
import businessfunctions.UpdateProfileUtility;
import businessfunctions.UserRegistrationUtility;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class InsuranceProjectTest {
	
	@BeforeSuite
	public static void InitializeBrowser() throws InterruptedException {
		
		BaseClass.OpenBrowser();
	}
	
	@Test(priority=0)
	public static void RunUserRegistrationTest() throws InterruptedException {
		UserRegistrationUtility.Register();
		
		Thread.sleep(5000);
		LoginLogoutUtility.Logout();
	}
	
	@Test(priority=1)
	public static void RunLoginTest() throws InterruptedException{
		Thread.sleep(5000);
		LoginLogoutUtility.Login();
		
	}
	
	@Test(priority=2)
	public static void RunUpdateLocation() throws InterruptedException{
	
		Thread.sleep(5000);
		UpdateLocationUtility.UpdateLocation();
	}
	
	@Test(priority=3)
	public static void RunApplyInsuranceTest() throws InterruptedException{
		
		Thread.sleep(5000);
		ApplyInsuranceUtility.BuyInsurance();
	}
	
	@Test(priority=4)
	public static void RunUpdateProfileTest() throws InterruptedException{
		
		Thread.sleep(5000);
		UpdateProfileUtility.UpdateProfileData();
	}
	
	@Test(priority=5)
	public static void RunLogoutTest() throws InterruptedException{
		
		Thread.sleep(5000);
		LoginLogoutUtility.Logout();
	}
	
	@AfterSuite
	public static void CloseBrowserSession() throws InterruptedException{
		
		Thread.sleep(5000);
		BaseClass.CloseBrowser();
	}
	

}
