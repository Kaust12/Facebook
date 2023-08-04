package StepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageSteps extends BaseClass {

	RegisterPage reg;
	@Given("User is on registerpage of facebook")
	public void user_is_on_registerpage_of_facebook() {
	    
		initilaziation();
	}

	@When("user enter {string} and {string} and {string} and {string} and  {string} and {string} and  {string} and  {string}")
	public void user_enter_and_and_and_and_and_and_and(String fname, String lname, String email, String confrmemail, String Pass, String date, String month, String year) {
	  
		 reg=new RegisterPage();
		 reg.RegisterPageFunctionality(fname, lname, email, confrmemail, Pass, date, month, year);
	}

	@Then("select gender")
	public void select_gender() {
	    
		reg.clickOngender();
	}

	@Then("click on signup button")
	public void click_on_signup_button() {
	   
		reg.clickOnsingUp();
	}
	
	@AfterStep
	public static void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			byte [] f=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f, "image/png",scenario.getName() );
		}
		else
		{
			byte f[]=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f, "image/png", scenario.getName());
		}
	}
	
	}


