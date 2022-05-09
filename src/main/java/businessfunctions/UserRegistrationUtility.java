package businessfunctions;


import pagerepository.NewUserRegisteration;

public class UserRegistrationUtility {

	static ConfigFileReader configFileReader = new ConfigFileReader();

	public static void Register() {
		NewUserRegisteration.clickLogin();
		NewUserRegisteration.enterEmail(configFileReader.properties.getProperty("EMAIL"));
		NewUserRegisteration.enterPwd(configFileReader.properties.getProperty("PASSWORD"));
		NewUserRegisteration.enterName(configFileReader.properties.getProperty("NAME"));
		NewUserRegisteration.enterMobNum(configFileReader.properties.getProperty("MOBILE_NUM"));
		NewUserRegisteration.enterGender(configFileReader.properties.getProperty("GENDER"));
		NewUserRegisteration.enterDob(configFileReader.properties.getProperty("DOB"));
		NewUserRegisteration.enterAdd1(configFileReader.properties.getProperty("ADDR1"));
		NewUserRegisteration.enterAdd2(configFileReader.properties.getProperty("ADDR2"));
		NewUserRegisteration.enterCity(configFileReader.properties.getProperty("CITY"));
		NewUserRegisteration.enterState(configFileReader.properties.getProperty("STATE"));
		NewUserRegisteration.enterZip(configFileReader.properties.getProperty("ZIP"));
		NewUserRegisteration.clickBtn();

	}

}
