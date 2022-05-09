package businessfunctions;

import pagerepository.ApplyInsurance;

public class ApplyInsuranceUtility {
	static ConfigFileReader configFileReader = new ConfigFileReader();
	
	public static void BuyInsurance() {
		
		ApplyInsurance.moveToLocation();
		ApplyInsurance.selectCoverage();
		ApplyInsurance.enterZip(configFileReader.properties.getProperty("NEW_ZIP"));
		ApplyInsurance.enterDob(configFileReader.properties.getProperty("DOB"));
		ApplyInsurance.selectGender();
		ApplyInsurance.enterHeight(configFileReader.properties.getProperty("HEIGHT"));
		ApplyInsurance.enterHeightInch(configFileReader.properties.getProperty("HEIGHT_INCH"));
		ApplyInsurance.enterWeight(configFileReader.properties.getProperty("WEIGHT"));
		ApplyInsurance.clickCondition1();
		ApplyInsurance.clickCondition2();
		ApplyInsurance.clickCondition3();
		ApplyInsurance.clickSbtn();
		ApplyInsurance.clickPayPremium();
		ApplyInsurance.clickPayPremiumCnfm();
		ApplyInsurance.FinalPayment();
		
	}

}
