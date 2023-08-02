package StepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterPageTest extends BaseClass {
	@Given("user on register page")
	public void user_on_register_page() {
	 
		intialization();
	}
/*
	@When("user enter \"<firstname>\"and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enter_firstname_and_and_and_and_and_and_and(String fName,String lName,String Email,String Cemail,String Password,String Date,String Month,String Year) throws InterruptedException {
	   
		RegisterPage reg=new RegisterPage();
		Thread.sleep(7000);
		reg.loginFunctionality(fName, lName, Email, Cemail, Password, Date, Month, Year);
		
	}
	*/
	
	@When("user enter {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enter_and_and_and_and_and_and_and(String fName, String lName, String Email, String Cemail, String Password, String Date, String Month, String Year) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		RegisterPage reg=new RegisterPage();
		Thread.sleep(7000);
		reg.loginFunctionality(fName, lName, Email, Cemail, Password, Date, Month, Year);
		
	    
	}
	
	@After
	public static void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			byte f[]=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f,"image/png",scenario.getName());
			
			
		}
		else
		{
			byte[] f=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f,"image/png",scenario.getName());
		}
		
		
	}
}
