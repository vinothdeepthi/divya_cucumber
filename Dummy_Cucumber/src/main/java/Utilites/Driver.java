package Utilites;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver  {
	
	static WebDriver driver;
	
	private Driver() {
		
	}
	
	 public static WebDriver getDriver()  {
		 

	        String browser = ConfigProperies.GetProperties("browser");

	        if (driver == null) {

	            switch (browser) {
	            
	                case "chrome":
	                    
	                	System.setProperty(ConfigProperies.GetProperties("system"),ConfigProperies.GetProperties("browserpath"));
	        			ChromeOptions option = new ChromeOptions();
	        			option.addArguments("--disable-notifications");
	        			driver = new ChromeDriver(option);
	        			break;
	        			
	                case "firefox":
	                    
	                	System.setProperty(ConfigProperies.GetProperties("system"),ConfigProperies.GetProperties("browserpath"));
	                    driver = new FirefoxDriver();
	                    break;
	                    
	                case "edge":
	                	
	                	System.setProperty(ConfigProperies.GetProperties("system"),ConfigProperies.GetProperties("browserpath"));
	                    driver = new EdgeDriver();
	                    break;
	                    
	                default:
	                	
	                	System.out.println("Given Browser Path Is Incorrect");
	            }
	            
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	        }
	        
	        return driver;
	    }

	    public static void closeDriver() {
	    	
	        if (driver != null) {
	            driver.close();
	            driver = null;
	        }
	    }

	    public static void quitDriver() {
	    	
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }

}
