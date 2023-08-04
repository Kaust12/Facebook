package PageLayer;

import static UtilityLayer.UtilsClass.*;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass {

	
	@FindBy(name="firstname")
	private WebElement fname;
	
	@FindBy(name="lastname")
	private WebElement lname;
	
	@FindBy(name="reg_email__")
	private WebElement email;
	
	@FindBy(name="reg_email_confirmation__")
	private WebElement cnfrmemail;
	
	@FindBy(name="reg_passwd__")
	private WebElement password;
	
	@FindBy(name="birthday_day")
	private WebElement bday;
	
	@FindBy(name="birthday_month")
	private WebElement bmonth;
	@FindBy(name="birthday_year")
	private WebElement byear;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement gender;
	
	@FindBy(xpath="(//button[text()='Sign Up'])[1]")
	private WebElement singupbtn;
	
	public RegisterPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void RegisterPageFunctionality(String Fname,String Lname,String Email,String CnfrmEmail,
			String Password,String Bday,String Bmonth,String Byear)
	
	{
		sendkey(fname,Fname);
		sendkey(lname,Lname);
		sendkey(email,Email);
		sendkey(cnfrmemail,CnfrmEmail);
		sendkey(password,Password);
		dropDown(bday,Bday);
		dropDown(bmonth,Bmonth);
		dropDown(byear,Byear);
		
		
	}
	
	public void clickOngender()
	{
		click(gender);
	}
	
	public void clickOnsingUp()
	{
		click(singupbtn);
	}
}
