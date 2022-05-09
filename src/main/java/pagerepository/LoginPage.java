package pagerepository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import businessfunctions.BaseClass;

public class LoginPage extends BaseClass{

	
	static By LoginLink= By.xpath("//*[@id=\"GenLink\"]/a");
	static By UserName= By.xpath("//*[@id=\"LEmail\"]");
	static By Password= By.xpath("//*[@id=\"LPwd\"]");
	static By LoginBtn = By.xpath("//*[@id=\"LBtn\"]");
	
  
	static public void clickLoginLink() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(LoginLink));
		driver.findElement(LoginLink).click();		
	}
	
	static public void enterUserName(String Uname) {
		driver.findElement(UserName).sendKeys(Uname);
	}
	
	static public void enterPassword(String Pwd) {
		driver.findElement(Password).sendKeys(Pwd);
	}
	
	static public void clickLoginBtn() {
		driver.findElement(LoginBtn).click();
	}
	

}

