
Feature: Verify Login Functionlity
Scenario:Login With Valid Credentials               
Given User As Navigate To Login Page
When User Enter Valid User Name  into the User Name Field
And User Enter Valid Password  into the password Field
And User Click On Login button
Then User Should Be Successfully Logged In The Application
       
