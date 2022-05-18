package utilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyClass {
	
	static String propFile = "C:\\Users\\blaxm\\workspace\\StripeRestAssuredAPI\\configFile.properties";
	
	static FileInputStream fis;
	
	static Properties prop;
		
	public PropertyClass() throws Exception{
		
	fis = new FileInputStream(propFile);
	
	prop = new Properties();
		
	prop.load(fis);
	
	}
	
	public String getBaseURL(){
		return prop.getProperty("baseURI");
	}
	public String getBasePathForPost(){
		return prop.getProperty("basePathforpost");
	}
	public String getBasePathForGet(){
		return prop.getProperty("basePathforget");
	}
	public String getBasePathForDelete(){
		return prop.getProperty("basePathfordelete");
	}
	public String getBasePathForUpdate(){
		return prop.getProperty("basePathforupdate");
	}
	public String getContentType(){
		return prop.getProperty("ContentType");
	}
	public String getKey(){
		return prop.getProperty("key");
	}
	public String getJsonFile(){
		return prop.getProperty("jsonFile");
	}
}
