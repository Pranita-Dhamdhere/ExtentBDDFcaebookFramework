package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {

	
	public static void sendKeys(WebElement wb,String value)
	{
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			wb.sendKeys(value);
		}
	}
	
	
	public static void SelectByVisibleText(WebElement wb,String Value)
	{
		Select sel=new Select(wb);
		sel.selectByVisibleText(Value);
	}
}
