package businessfunctions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	Properties properties;
	private final String propertiesFilePath= "resources//data.properties";

	public ConfigFileReader(){
		BufferedReader fileReader;
		try {
			fileReader = new BufferedReader(new FileReader(propertiesFilePath));
			properties = new Properties();
			try {
				properties.load(fileReader);
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("data.properties not found at " + propertiesFilePath);
		}		
	}
}
