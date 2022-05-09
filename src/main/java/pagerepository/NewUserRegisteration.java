package pagerepository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import businessfunctions.BaseClass;

public class NewUserRegisteration extends BaseClass {

	
		
//		System.setProperty("webdriver.chrome.driver","/Users/mahenyamini/Downloads/chromedriver 3");
//
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.get(" http://tanchan-001-site3.btempurl.com/production/");
		
		static By LoginLink= By.xpath("//*[@id=\"GenLink\"]/a");
		static By REmail = By.id("REmail");
		static By RPwd = By.id("RPwd");
		static By RName = By.id("RName");
		static By RMobile = By.id("RMobile");
		static By RGender = By.xpath("//*[@id=\"RForm\"]/div[3]/div[1]/div[1]/label");
		static By RDob = By.id("RDob");
		static By Address1 = By.id("RAddress_1");
		static By Address2 = By.id("RAddress_2");
		static By RCity = By.id("RCity");
		static By RState = By.id("RState");
		static By RZip = By.id("RZip");
		static By RBtn = By.id("RBtn");
		
		static public void clickLogin() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(LoginLink));
			
			driver.findElement(LoginLink).click();
		}
		
		static public void enterEmail(String Email) {
			//driver.findElement(REmail).sendKeys("y"+System.currentTimeMillis()+"@gmail.com");
			driver.findElement(REmail).sendKeys(Email);
		}
		
		static public void enterPwd(String Pwd) {
			 driver.findElement(RPwd).sendKeys(Pwd);
		}
		
		static public void enterName(String Name) {
			driver.findElement(RName).sendKeys(Name);
		}
		
		static public void enterMobNum(String mnum) {
			 driver.findElement(RMobile).sendKeys(mnum);
		}
		
		static public void enterGender(String Gender) {
			  driver.findElement(RGender).click();
		}
		
		static public void enterDob(String Dob) {
			driver.findElement(RDob).sendKeys(Dob);
		}
		
		static public void enterAdd1 (String Add1) { 
			 driver.findElement(Address1).sendKeys(Add1);
		}
		
		static public void enterAdd2 (String Add2) {
			driver.findElement(Address2).sendKeys(Add2);
		}
		
		static public void enterCity (String City) {
			driver.findElement(RCity).sendKeys(City);
		}
		
		static public void enterState (String State) {
			driver.findElement(RState).sendKeys(State);
		}
		
		static public void enterZip (String Zip) {
			driver.findElement(RZip).sendKeys(Zip);
		}
		
		static public void clickBtn () {
			driver.findElement(RBtn).click();
		}
	
		
}

//	    driver.findElement(By.linkText("LOGIN")).click();
//	    
//	    driver.findElement(By.id("REmail")).sendKeys("y"+System.currentTimeMillis()+"@gmail.com");
//	    
//	    driver.findElement(By.id("RPwd")).sendKeys("Password1");
//	    
//	    driver.findElement(By.id("RName")).sendKeys("Mike");
//	    
//	    driver.findElement(By.id("RMobile")).sendKeys("1234567891");
//	    
//	    driver.findElement(By.xpath("//*[@id=\"RForm\"]/div[3]/div[1]/div[1]/label")).click();
//	    
//	    driver.findElement(By.id("RDob")).sendKeys("12/16/1990");
//	    
//	    driver.findElement(By.id("RAddress_1")).sendKeys("123MainStreet");
//	    
//	    driver.findElement(By.id("RAddress_2")).sendKeys("officelocation");
//	    
//	    driver.findElement(By.id("RCity")).sendKeys("Irvine");
//	    
//	    driver.findElement(By.id("RState")).sendKeys("California");
//	    
//	    driver.findElement(By.id("RZip")).sendKeys("92604");
//	    
//	    driver.findElement(By.id("RBtn")).click();
//	    
	  //  driver.close();
	    
	


