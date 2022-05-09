package pagerepository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import businessfunctions.BaseClass;

public class UpdateProfile extends BaseClass{

	//		System.setProperty("webdriver.chrome.driver","/Users/mahenyamini/Downloads/chromedriver 3");
	//
	//		WebDriver driver = new ChromeDriver();
	//
	//		driver.manage().window().maximize();
	//
	//		driver.get("http://tanchan-001-site3.btempurl.com/production/dashboard");
	//
	//		driver.findElement(By.id("LEmail")).sendKeys("mike2@gmail.com");
	//
	//		driver.findElement(By.id("LPwd")).sendKeys("Password1");
	//
	//		driver.findElement(By.id("LBtn")).click();



	public static void clickEditProfile() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("EDIT PROFILE")));


		Actions actions = new Actions(driver);
		//		
		//		WebElement location = driver.findElement(By.id("dropdown01"));
		//		
		//		actions.moveToElement(location).click().build().perform();
		//		

		//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("EDIT PROFILE")));


		WebElement editProfile = driver.findElement(By.linkText("EDIT PROFILE"));

		actions.moveToElement(editProfile).click().build().perform(); 
	}

	public static void updateLocationName(String lction) {
		WebElement location =  driver.findElement(By.id("UAddress_2"));

		location.click();
		location.clear();
		location.sendKeys(lction);
	}

	public static void clickUpdateBtn() {
		driver.findElement(By.id("UBtn")).click();
	}
}

