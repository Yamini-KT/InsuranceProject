package businessfunctions;

import pagerepository.DashboardUpdateLocation;

public class UpdateLocationUtility {
	
	static ConfigFileReader configFileReader = new ConfigFileReader();
	
	public static void UpdateLocation() {
	
		DashboardUpdateLocation.moveToLocation();
		DashboardUpdateLocation.updateLocation(configFileReader.properties.getProperty("NEW_ZIP"));
		DashboardUpdateLocation.clickSubmitBtn();
	}

}
