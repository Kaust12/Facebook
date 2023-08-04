package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {

	 public static void sendkey(WebElement wb,String Value)
	 {
		 if(wb.isDisplayed()&& wb.isEnabled())
		 {
			 wb.sendKeys(Value);
		 }
		
	 }
	 
	 public static void click(WebElement wb)
	 {
		 if(wb.isDisplayed()&& wb.isEnabled())
		 {
			 wb.click();
		 }
		
	 }
	 
	 public static void dropDown(WebElement wb,String Value)
	 {
		 if(wb.isDisplayed()&& wb.isEnabled())
		 {
			 Select sel=new Select(wb);
			 sel.selectByVisibleText(Value);
		 }
		
	 }
}
