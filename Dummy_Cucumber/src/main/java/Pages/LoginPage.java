package Pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.ConfigProperies;
import Utilites.Driver;
import Utilites.ReuseMethods;


public class LoginPage {
	
	
	ReuseMethods re = new ReuseMethods();
	
	
	@FindBy(name = "q")
	private WebElement UserName;
	
	@FindBy(xpath = "")
	private WebElement Password;
	
	@FindBy(xpath = "")
	private WebElement LoginButton;
	
	public LoginPage()  {
		
			PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	public void EnterUserName()  {
		
		re.TypeTextIntoElement(UserName, ConfigProperies.GetProperties("username"), 20);
	}
	
	
	public void EnterPassword() throws IOException {
		
		re.TypeTextIntoElement(Password, ConfigProperies.GetProperties("password")+Keys.ENTER, 20);
	}
	
	public void clickOnLoginButton() throws IOException {
		
		re.ClickOnElement(LoginButton, 20);
		
	}

}
