package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\admin\\eclipse-workspace\\Dummy_Cucumber\\src\\test\\resources\\FeatureFile\\LoginFunction.feature"},
        dryRun = !true,
        glue = "StepDefenition",
        monochrome = true
        
        
                                                
)
public class Runner {
	
	
	

}
