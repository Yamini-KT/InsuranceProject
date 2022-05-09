package businessfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

		public static WebDriver  driver = null;
		static ConfigFileReader configFileReader = new ConfigFileReader();
		

		public static void OpenBrowser() {

			System.setProperty("webdriver.chrome.driver",configFileReader.properties.getProperty("WEBDRIVER_PATH"));

			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get(configFileReader.properties.getProperty("URL"));
		}

		public static void CloseBrowser() {

			driver.close();
			driver.quit();
		}
	}
