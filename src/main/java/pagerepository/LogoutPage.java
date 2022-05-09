package pagerepository;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import businessfunctions.BaseClass;

public class LogoutPage extends BaseClass{

	static By MyAccount = By.xpath("//*[@id=\"dropdown03\"]");
	static By LogoutBtn = By.xpath("//*[@id=\"AuthLink\"]/div/a[3]");

	static public void clickMyAccount() {
		WebElement menuBtn = new WebDriverWait(driver, Duration.ofMinutes(1)).until(ExpectedConditions.elementToBeClickable(MyAccount));
		driver.findElement(MyAccount).click();
	}

	static public void clickLogoutBtn() {
		driver.findElement(LogoutBtn).click();
	}

}
