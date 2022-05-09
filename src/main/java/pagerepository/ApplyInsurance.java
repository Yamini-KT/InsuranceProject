package pagerepository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import businessfunctions.BaseClass;

public class ApplyInsurance extends BaseClass{

	//	public static void main(String[] args) throws InterruptedException {
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


	static By ApplyInsBtn = By.linkText("Apply Life Insurance");
	static By LQZip =By.id("LQZip");
	static By LQDob = By.id("LQDob");
	static By LGender = By.xpath("//*[@id=\"LQForm\"]/div[3]/div[1]/div[1]/label");
	static By LHeight = By.id("LQHeightF");
	static By LHeightInch = By.id("LQHeightI");
	static By LWeight = By.id("LQWeight");
	static By Condition1 = By.xpath("//*[@id=\"LQForm\"]/div[4]/div[2]/div[2]/label");
	static By Condition2 = By.xpath("//*[@id=\"LQForm\"]/div[5]/div[2]/div[2]/label");
	static By Condition3 = By.xpath("//*[@id=\"LQForm\"]/div[7]/label");
	static By SBtn = By.id("LQBtn");
	static By PayPremium = By.xpath("//*[@id=\"InsurerTbl\"]/tr[1]/td[5]/button");
	
	
	static By PayPremiumCnfm = By.xpath("//*[@id=\"PPBtn\"]");
	static By FinalPayment = By.id("MDPayBtn");


	public static void moveToLocation () {

		Actions actions = new Actions(driver);

		WebElement location = driver.findElement(By.id("dropdown01"));

		actions.moveToElement(location).click().build().perform();

		driver.findElement(ApplyInsBtn).click();

	}

	public static void selectCoverage() {
		Select coverage = new Select(driver.findElement(By.id("LQCoverage")));

		coverage.selectByValue("15000");

	}

	public static void enterZip (String Zip) {
		driver.findElement(LQZip).sendKeys(Zip);  
	}

	public static void enterDob(String Dob) {
		driver.findElement(LQDob).sendKeys(Dob);
	}

	public static void selectGender() {
		driver.findElement(LGender).click();
	}

	public static void enterHeight(String h) {
		driver.findElement(LHeight).sendKeys(h);
	}

	public static void enterHeightInch(String i) {
		driver.findElement(LHeightInch).sendKeys(i);  
	}

	public static void enterWeight(String weight) {
		driver.findElement(LWeight).sendKeys(weight);
	}

	public static void clickCondition1() {
		driver.findElement(Condition1).click();
	}

	public static void clickCondition2() {
		driver.findElement(Condition2).click();

	}

	public static void clickCondition3() {
		driver.findElement(Condition3).click();

	}

	public static void clickSbtn() {
		driver.findElement(SBtn).click();

	}
	

	public static void clickPayPremium() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(PayPremium));
		driver.findElement(PayPremium).click();
	}

	public static void clickPayPremiumCnfm() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated(PayPremiumCnfm));
		driver.findElement(PayPremiumCnfm).click();
	}

	public static void FinalPayment() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(FinalPayment));
		driver.findElement(FinalPayment).click();
	}
}
//
//	driver.findElement(By.id("LQZip")).sendKeys("92604");
//
//	driver.findElement(By.id("LQDob")).sendKeys("12/16/1990");
//
//
//
//	driver.findElement(By.xpath("//*[@id=\"LQForm\"]/div[3]/div[1]/div[1]/label")).click();
//
//	driver.findElement(By.id("LQHeightF")).sendKeys("6");
//
//	driver.findElement(By.id("LQHeightI")).sendKeys("1");
//
//	driver.findElement(By.id("LQWeight")).sendKeys("155");
//
//	driver.findElement(By.xpath("//*[@id=\"LQForm\"]/div[4]/div[2]/div[2]/label")).click();
//
//	driver.findElement(By.xpath("//*[@id=\"LQForm\"]/div[5]/div[2]/div[2]/label")).click();
//
//	driver.findElement(By.xpath("//*[@id=\"LQForm\"]/div[7]/label")).click();
//
//	driver.findElement(By.id("LQBtn")).click();
//
//
//
//	//*[@id="InsurerTbl"]/tr[1]/td[5]/button
//
//	//pay premmium button
//	driver.findElement(By.xpath("//*[@id=\"InsurerTbl\"]/tr[1]/td[5]/button")).click();
//
//	//final payment confirmation btn
//	driver.findElement(By.xpath("//*[@id=\"PPBtn\"]")).click();
//
//	//final payment
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("MDPayBtn")));
//
//	driver.findElement(By.id("MDPayBtn")).click();




