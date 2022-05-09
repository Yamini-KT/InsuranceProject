package pagerepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import businessfunctions.BaseClass;

public class ClickLogin extends BaseClass{


//     System.setProperty("webdriver.chrome.driver", "/Users/mahenyamini/Downloads/chromedriver 3");
//     WebDriver driver = new ChromeDriver();
//     driver.get("http://tanchan-001-site3.btempurl.com/production/");
//     driver.manage().window().maximize();
     
     
     static By LoginLink = By.linkText("LOGIN");
     
     public static void clickLogin() {
    	 driver.findElement(LoginLink).click();
     }
     
//     driver.findElement(By.linkText("LOGIN")).click();
     
     //driver.close();
     
     
	}


