package pagerepository;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import businessfunctions.BaseClass;

public class DashboardUpdateLocation extends BaseClass{


//		System.setProperty("webdriver.chrome.driver","/Users/mahenyamini/Downloads/chromedriver 3");
//
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.get("http://tanchan-001-site3.btempurl.com/production/dashboard");
		
		
		static By ZipBtn = By.id("MDZBtn");
		
		
		
		public static void moveToLocation () {
			Actions actions = new Actions(driver);
			
			WebElement location = driver.findElement(By.xpath("//*[@id=\"lctext\"]"));
			
			actions.moveToElement(location).click().build().perform();
		}
		
		
		public static void updateLocation(String Location){
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mdzip")));
			
			WebElement currLtc = driver.findElement(By.id("mdzip"));
			
			currLtc.click();
			
			currLtc.clear();
			
			currLtc.sendKeys(Location);
		}
		
		public static void clickSubmitBtn () {
			driver.findElement(ZipBtn).click();
		}
		
}	
		
		
//		driver.findElement(By.id("LEmail")).sendKeys("mike2@gmail.com");
//		
//		driver.findElement(By.id("LPwd")).sendKeys("Password1");
//		
//		driver.findElement(By.id("LBtn")).click();
//		
//		Actions actions = new Actions(driver);
//		
//		WebElement location = driver.findElement(By.xpath("//*[@id=\"lctext\"]"));
//		
//		actions.moveToElement(location).click().build().perform();
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mdzip")));
//		
//		WebElement currLtc = driver.findElement(By.id("mdzip"));
//		
//		currLtc.click();
//		
//		currLtc.clear();
//		
//		currLtc.sendKeys("92780");
//		
//		driver.findElement(By.id("MDZBtn")).click();
	
	


