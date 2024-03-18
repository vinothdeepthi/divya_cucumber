package StepDefenition;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeMethod;

import Utilites.ConfigProperies;
import Utilites.Driver;
import Utilites.ReuseMethods;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@Before
	public void LounchApplication()  {
		
		System.out.println("vinoth test");
		Driver.getDriver().get(ConfigProperies.GetProperties("url"));
		
	}
	
	
	@AfterStep
	public void TearDown(Scenario sc)  {
		
		if(sc.isFailed()== true) {
			
			TakesScreenshot tk = (TakesScreenshot)Driver.getDriver();
			
			File src = tk.getScreenshotAs(OutputType.FILE);
			
			File file = new File(ConfigProperies.GetProperties("ScreenshotFolder")+sc.getName()+".png");
			
			
			
		try {
			
			FileUtils.copyFile(src, file);
		}
		
		catch (FileNotFoundException e) {
		
			System.out.println(e.getMessage());
		} 
		
		catch (IOException e) {
			
			e.printStackTrace();
		}
			
			
		}
	}
	
	@After
	public void CloseApplication() {
		
		Driver.quitDriver();
	}

}
