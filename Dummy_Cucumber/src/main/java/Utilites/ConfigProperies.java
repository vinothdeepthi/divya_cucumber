package Utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperies {
	
	 static Properties pro;
	
	 static  {
		
		try {
			
			FileInputStream fil = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Dummy_Cucumber\\src\\test\\resources\\Config.properties");
			
			 pro = new Properties();
			
			pro.load(fil);
			
		}  catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	public static String GetProperties(String key) {
		
		return pro.getProperty(key);
	}
	    
	   
	   

}
