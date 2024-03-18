package StepDefenition;

import Pages.LoginPage;
import Utilites.ConfigProperies;
import Utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionlity {
	
	LoginPage login = new LoginPage();
	
	
	@Given("User As Navigate To Login Page")
	public void user_as_navigate_to_login_page() {
		
		login.EnterUserName();
	}
	@When("User Enter Valid User Name  into the User Name Field")
	public void user_enter_valid_user_name_into_the_user_name_field() {
	   
	}
	@When("User Enter Valid Password  into the password Field")
	public void user_enter_valid_password_into_the_password_field() {
	    
	}
	@When("User Click On Login button")
	public void user_click_on_login_button() {
	    
	}
	@Then("User Should Be Successfully Logged In The Application")
	public void user_should_be_successfully_logged_in_the_application() {
	   
	}
}
