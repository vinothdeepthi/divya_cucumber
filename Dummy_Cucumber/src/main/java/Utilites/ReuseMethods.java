package Utilites;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReuseMethods {
	
	
	public ReuseMethods() {
		
		
	}
	
	
public void ClickOnElement(WebElement ele, long duration)  {
		
		
		
		WebElement element = WaitforElement(ele, duration);
		
		element.click();
	}
	
	public void TypeTextIntoElement(WebElement ele,String text,long Duration)  {
	
		
		
		WebElement element = WaitforElement(ele, Duration);
		
		element.click();
		element.clear();
		element.sendKeys(text);
	}
	
	public WebElement WaitforElement(WebElement element,long Duration)  {
		
		   WebElement ele = null;
		
          WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration);
		
		return ele =wait.until(ExpectedConditions.elementToBeClickable(element));
		
		
	}
	
	public void SlelectByvisibleText(WebElement ele,String text,long Duration)  {
		
		WebElement element = WaitforElement(ele, Duration);
		
		Select select = new Select(element);
		
		select.selectByVisibleText(text);
		
		
	}
	
       public void SlelectByIndext(WebElement ele,int indext,long Duration) {
		
		WebElement element = WaitforElement(ele, Duration);
		
		Select select = new Select(element);
		
		select.selectByIndex(indext);
		
	}
       
       public void SlelectByValue(WebElement ele,String text,long Duration)  {
   		
   		WebElement element = WaitforElement(ele, Duration);
   		
   		Select select = new Select(element);
   		
   		select.selectByValue(text);	
   	}
       
       public WebElement WaitforElementToBeVisible(WebElement ele,long Duration)  {
    	   
    	   WebElement element=null;
    	   
    	   WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration);
    	   
    	  element = wait.until(ExpectedConditions.visibilityOf(ele));
    	  
    	  return element;
       }
       
       public void MouseOverAndClick(WebElement ele,long Duration)  {
    	   
    	  WebElement element= WaitforElementToBeVisible(ele, Duration);
    	  
    	  Actions act = new Actions(Driver.getDriver());
    	  
    	  act.moveToElement(element).click().perform();
       }
       
       public void JavaScriptClick(WebElement ele , long Duration ) {
    	   
    	  WebElement element = WaitforElementToBeVisible(ele, Duration);
    	  
    	  JavascriptExecutor java = (JavascriptExecutor)Driver.getDriver();
    	  
    	  java.executeScript("arguments[0].click();", element);
    	   
    	   
       }
       
       public void JavaScripSendkeys(WebElement ele , long Duration ,String type)  {
    	   
     	  WebElement element = WaitforElementToBeVisible(ele, Duration);
     	  
     	  JavascriptExecutor java = (JavascriptExecutor)Driver.getDriver();
     	  
     	  java.executeScript("arguments[0].value='"+type+"'", element);
     	   
     	   
        }
       
       public String GetParentWindow()  {
    	   
    	   String Parent = Driver.getDriver().getWindowHandle();
    	   return Parent;
       }
       
       public void SwitchToSecondWindow() {
    	   
    	   Set<String> allwindow = Driver.getDriver().getWindowHandles();
    	   
    	   for (String win : allwindow) {
			
    		   if(!win.equalsIgnoreCase(GetParentWindow())) {
    			   Driver.getDriver().switchTo().window(win);
    			  break;
    		   }
		}
       }

}
