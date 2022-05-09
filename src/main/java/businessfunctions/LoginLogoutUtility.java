package businessfunctions;

import pagerepository.LoginPage;
import pagerepository.LogoutPage;

public class LoginLogoutUtility {
	
	static ConfigFileReader configFileReader = new ConfigFileReader();

	public static void Login() {
		LoginPage.clickLoginLink();
		LoginPage.enterUserName(configFileReader.properties.getProperty("EMAIL"));
		LoginPage.enterPassword(configFileReader.properties.getProperty("PASSWORD"));
		LoginPage.clickLoginBtn();
	}
	
	public static void Logout() {
		LogoutPage.clickMyAccount();
		LogoutPage.clickLogoutBtn();
	}
}
