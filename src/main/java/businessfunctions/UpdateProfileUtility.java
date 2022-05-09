package businessfunctions;

import pagerepository.UpdateProfile;

public class UpdateProfileUtility {
static ConfigFileReader configFileReader = new ConfigFileReader();
	
	public static void UpdateProfileData() {
		
		UpdateProfile.clickEditProfile();
		UpdateProfile.updateLocationName(configFileReader.properties.getProperty("NEW_LOCATION"));
		
		UpdateProfile.clickUpdateBtn();
		
		
	}

}
